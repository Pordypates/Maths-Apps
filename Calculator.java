import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    static int num_1;
    static int num_2;
    static double answer;
    static String calculation;

    public static String[] calculations = {"Addition", "Subtraction", "Multiplication", "Division", "Modulus",
            "Exponentiation", "Square Root" };      // best practice for long array code?


    public static void CalculationSelect(){     // is there any point having separate methods for each calculation?

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please select a calculation from the following and then the first and second integer.");

        System.out.println(Arrays.toString(calculations));

        calculation = myObj.nextLine();
        num_1 = myObj.nextInt();
        num_2 = myObj.nextInt();

        switch (calculation) {
            case "Addition":
                Addition();
                break;
            case "Subtraction":
                Subtraction();
                break;
            case "Multiplication":
                Multiplication();
                break;
            case "Division":
                Division();
                break;
            case "Modulus":
                Modulus();
                break;
            case "Exponentiation":
                Exponentiation();
                break;
            default:
                System.out.println("This is not a valid calculation. Please select another.");
                CalculationSelect();
        }
    }

    public static void Addition(){
        answer = num_1 + num_2;
        System.out.println(num_1 + " + " + num_2 + " = " + answer);
        CalculationSelect();
    }

    public static void Subtraction(){
        answer = num_1 - num_2;
        System.out.println(num_1 + " - " + num_2 + " = " + answer);
        CalculationSelect();
    }

    public static void Multiplication(){
        answer = num_1 * num_2;
        System.out.println(num_1 + " x " + num_2 + " = " + answer);
        CalculationSelect();
    }

    public static void Division(){
        answer = num_1 / num_2;
        System.out.println(num_1 + " ÷ " + num_2 + " = " + answer);
        CalculationSelect();
    }

    public static void Modulus(){
        answer = num_1 % num_2;
        System.out.println("The remainder of " + num_1 + " ÷ " + num_2 + " is: " + answer);
        CalculationSelect();
    }

    public static void Exponentiation(){

        answer = Math.pow(num_1, num_2);
        System.out.println(num_1 + " to the power of " + num_2 + " is: " + answer);
        CalculationSelect();
    }

//    public static void SquareRoot(double num){
//        answer = Math.sqrt(num);
//        System.out.println("The square root of " + num + " is: " + answer);
//        CalculationSelect();
//    }
}
