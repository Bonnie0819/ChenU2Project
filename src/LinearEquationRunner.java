import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Welcoming user to the program
        System.out.println("Welcome!");

        System.out.println("Enter Coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.println("Enter Coordinate 2: ");
        String coord2 = scan.nextLine();

        //Parsing coordinate values
        //coordinate 1
        int comma1 = coord1.indexOf(",");
        int coord1Length = coord1.length();

        int coord1X = Integer.parseInt(coord1.substring(1,comma1));
        int coord1Y = Integer.parseInt(coord1.substring(comma1 +1, coord1Length -1));

        //coordinate 2
        int comma2 = coord2.indexOf(",");
        int coord2Length = coord2.length();

        int coord2X = Integer.parseInt(coord1.substring(1,comma2));
        int coord2Y = Integer.parseInt(coord1.substring(comma2 +1, coord2Length -1));

        System.out.println(coord1X);
        System.out.println(coord1Y);
        System.out.println(coord2X);
        System.out.println(coord2Y);



    }
}
