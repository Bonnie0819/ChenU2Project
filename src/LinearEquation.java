public class LinearEquation {

    public LinearEquation() {
    }

    public double slope(int coord2Y, int coord1Y, int coord2X, int coord1X) {
        int rise = coord2Y - coord1Y;
        int run = coord2X - coord1X;
        double slope = rise/run;

        return slope;
    }
    public String equation() {

        return "The equation of the line between these two points is: y = ";
    }
}
