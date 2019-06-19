import java.util.Scanner;

import java.util.Arrays;

public class Application {

    static String mode = "Default";

    static String[] modes = {"Calculator", "Even or Odd", "Less And More"};

    public static void ModeSelect(){

        switch (mode) {
            case "Calculator":
                mode = "Calculator";
                System.out.println("Calculator mode has been selected.");
                break;
            case "Even or Odd":
                mode = "Even or Odd";
                System.out.println("Even or Odd mode has been selected.");
                break;
            case "Less and More":
                mode = "Less and More";
                System.out.println("Less and More mode has been selected.");
                break;
            default:
                mode = "Default";
                System.out.println("This is not a valid mode. Please select another.");
        }
    }

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        while (mode == "Default") {
            System.out.println("Please select the mode you wish to use from the following: ");
            System.out.println(Arrays.toString(modes));
            mode = myObj.nextLine();
            ModeSelect();
        }

        if (mode == "Calculator") {
            Calculator.CalculationSelect();
        }

        if (mode == "Even or Odd") {
            EvenOdd.EvenOrOdd();
        }
    }
}
