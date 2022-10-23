import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Welcoming user to the program
        System.out.println("Welcome!");

        System.out.println("Enter Coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.println("Enter Coordinate 2: ");
        String cord2 = scan.nextLine();


        //Parsing coordinate values
        //coordinate 1
        int comma1 = cord1.indexOf(",");
        int cord1Length = cord1.length();

        int x1 = Integer.parseInt(cord1.substring(1,comma1));
        int y1 = Integer.parseInt(cord1.substring(comma1 + 2, cord1Length -1));

        //coordinate 2
        int comma2 = cord2.indexOf(",");
        int cord2Length = cord2.length();

        int x2 = Integer.parseInt(cord2.substring(1,comma2));
        int y2 = Integer.parseInt(cord2.substring(comma2 + 2, cord2Length -1));

        //creating LinearEquation Object
        LinearEquation test = new LinearEquation(x1, y1, x2, y2);

        System.out.println(test.lineInfo());

        //asking user to pick a x value
        System.out.println();
        System.out.println("Enter a value for x: ");
        double xValue = scan.nextDouble();
        scan.nextLine();

        System.out.println(test.coordinateForX(xValue));



    }
}
