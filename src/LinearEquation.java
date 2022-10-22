public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope() {
        int rise = y2 - y1;
        int run = x2 - x1;
        double slope = (double) (rise)/run;

        return Math.round(slope * 100) /100.0;
    }

    public double yInt() {
        double yInt = y1 - (slope() * x1);
        return Math.round(yInt * 100)/100.0;
    }

    public double distance() {
        double xValue = Math.pow(x2 - x1, 2);
        double yValue = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(xValue + yValue);

        return Math.round(distance * 100)/100.0;
    }
    public String equation() {
        String equation = "";

        if(slope() == 0) { equation += "";}
        else { equation += slope() + "x";}

        if(yInt() == 0) { equation += "";}
        else {
            if (yInt() > 0) {
                equation += " + " + yInt();
            } else {
                equation += "- " + Math.abs(yInt());
            }
        }

        return equation;
    }

    public String lineInfo() {
        String line1 = "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        String line2 = "The equation of the line between these points is: " + equation();
        String line3 = "The slope of the line is: " + slope();
        String line4 = "The Y-intercept of the line is: " + yInt();
        String line5 = "The distance between the two points is: " + distance();

        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n";
    }

    public String coordinateForX(double xValue) {
        double yVal = slope() * xValue + yInt();
        return "(" + xValue + ", " + yVal + ")";
    }



}
