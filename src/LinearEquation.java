public class LinearEquation {
    //instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //constructor method
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Methods
    //calculates the slope of the line
    public double slope() {
        int rise = y2 - y1;
        int run = x2 - x1;
        double slope = (double) (rise) / run;

        return roundedToHundredth(slope);
    }

    //calculates the y-intercept of the line
    public double yInt() {
        double yInt = y1 - (slope() * x1);
        return roundedToHundredth(yInt);
    }

    //calculates the distance between the two points given
    public double distance() {
        double xValue = Math.pow(x2 - x1, 2);
        double yValue = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(xValue + yValue);

        return roundedToHundredth(distance);
    }

    //creates a String that represents the equation of the line
    public String equation() {
        String equation = "y = ";

        //makes sure the slope is printed out correctly in the equation
        if (slope() == 0) {
            equation += "";
        } else if (slope() == 1) {
            equation += "x";
        } else if (slope() == -1) {
            equation += "-x";
        } else if (slope() == (int) slope()) {
            equation += (int) slope() + "x";
        } else if (slope() > 1) {
            equation += Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
        } else if (slope() < -1) {
            equation += "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
        }

        //checks to see if y-intercept is negative or positive and prints out accordingly
        if(yInt() == 0) { equation += "";}
        else {
            if (yInt() < 0) {
                equation += " - " + Math.abs(yInt());
            } else {
                if (yInt() > 0 && slope() > 0) {
                    equation += " + " + yInt();
                } else {
                    equation += yInt();
                }
            }
        }

        return equation;
    }

    //prints out all the info of the equation
    public String lineInfo() {
        if(x2 - x1 == 0 && y2 - y1 != 0) {
            return "These points are on a vertical line: x = " + x1;
        } else {
            String line1 = "The two points are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
            String line2 = "The equation of the line between these points is: " + equation();
            String line3 = "The slope of the line is: " + slope();
            String line4 = "The Y-intercept of the line is: " + yInt();
            String line5 = "The distance between the two points is: " + distance();
            return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n";
        }
    }

    //returns the coordinates of the equation for the xValue entered by user
    public String coordinateForX(double xValue) {
        double yVal = slope() * xValue + yInt();
        return "(" + xValue + ", " + yVal + ")";
    }

    //returns the value toRound rounded to the nearest hundredths
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100)/100.0;
    }



}
