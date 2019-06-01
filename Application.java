import java.util.Scanner;

public class Application {

    static String mode = "Default";

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
            System.out.println("Calculator");
            System.out.println("Even or Odd");
            System.out.println("Less and More");
            mode = myObj.nextLine();
            ModeSelect();
        }

        if (mode == "Calculator") {
            System.out.println("Please select the calculation from the following: ");
            System.out.println(Arrays.toString(Calculator.calculations));
        }

        /* System.out.println("Calculator tests");
        System.out.println("================");
        Calculator.Calculation(2, 4, '+');      // addition
        Calculator.Calculation(62, 28, '-');    // subtraction
        Calculator.Calculation(14, 10, '*');    // multiplication
        Calculator.Calculation(100, 10, '/');   // division
        Calculator.Calculation(6, 2, '%');      // modulus (remainder)
        Calculator.Exponentiation(14, 2);                              // exponentiation (power of)
        Calculator.SquareRoot(4);                                // square root

        System.out.println("Less than / More than / Equal to tests");
        System.out.println("================");
        LessAndMore.LessOrMore(4, 1);       // more than
        LessAndMore.LessOrMore(32, 60);     // less than
        LessAndMore.LessOrMore(130, 130);   // equal to

        System.out.println("Even / Odd number tests");
        System.out.println("================");
        EvenOdd.EvenOrOdd(48);
        EvenOdd.EvenOrOdd(17); */
    }
}
