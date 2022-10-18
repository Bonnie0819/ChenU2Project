public class LinearEquation {
    private String coord1;
    private String coord2;
    public LinearEquation(String coord1, String coord2) {
        this.coord1 = coord1;
        this.coord2 = coord2;
    }

    public int coord1X() {
        int comma1 = coord1.indexOf(",");
        int coord1Length = coord1.length();

        return Integer.parseInt(coord1.substring(1,comma1));
    }

    public int coord1Y() {
        int comma1 = coord1.indexOf(",");
        int coord1Length = coord1.length();

        return Integer.parseInt(coord1.substring(comma1 + 2, coord1Length -1));
    }

    public int coord2X() {
        int comma2 = coord2.indexOf(",");
        int coord2Length = coord2.length();

        return Integer.parseInt(coord2.substring(1,comma2));
    }
    public int coord2Y() {
        int comma2 = coord2.indexOf(",");
        int coord2Length = coord2.length();

        return Integer.parseInt(coord2.substring(comma2 + 2, coord2Length -1));
    }


    public double slope(int coord2Y, int coord1Y, int coord2X, int coord1X) {
        int rise = coord2Y - coord1Y;
        int run = coord2X - coord1X;
        double slope = rise/run;

        return slope;
    }

    public double yInt() {
        return 0;
    }

    public double distance() {
        return 0;
    }
    public String equation() {
        String points = "The two points are " + coord1 + " and " + coord2;
        return "The equation of the line between these two points is: y = ";
    }


}
