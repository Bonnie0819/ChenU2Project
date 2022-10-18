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

    public double slope() {
        int rise = coord2Y() - coord1Y();
        int run = coord2X() - coord1X();
        double slope = (double) (rise)/run;

        return Math.round(slope * 100) /100.0;
    }

    public double yInt() {
        double yInt = coord1Y() - (slope() * coord1X());
        return Math.round(yInt * 100)/100.0;
    }

    public double distance() {
        double xValue = Math.pow(coord2X() - coord1X(), 2);
        double yValue = Math.pow(coord2Y() - coord1Y(), 2);
        double distance = Math.sqrt(xValue + yValue);

        return Math.round(distance * 100)/100.0;
    }
    public String equation() {
        String equation = "";

        if(slope() == 0) { equation += "";}
        else { equation += slope() + "x";}

        if(yInt() == 0) { equation += "";}
        else { equation += " + " + yInt();}

        return equation;
    }

    public String lineInfo() {
        String line1 = "The two points are " + coord1 + " and " + coord2;
        String line2 = "The equation of the line between these points is: " + equation();
        String line3 = "The slope of the line is: " + slope();
        String line4 = "The Y-intercept of the line is: " + yInt();
        String line5 = "The distance between the two points is: " + distance();

        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n";
    }


}
