public class Application {

    public static void main(String[] args){

        System.out.println("Calculator tests");
        System.out.println("================");
        Calculator.Calculation(2, 4, '+');      // addition
        Calculator.Calculation(62, 28, '-');    // subtraction
        Calculator.Calculation(14, 10, '*');    // multiplication
        Calculator.Calculation(100, 10, '/');   // division
        Calculator.Calculation(6, 2, '%');      // modulus (remainder)
        Calculator.Exponentiation(14, 2);                              // exponentiation (power of)

        System.out.println("Less than / More than / Equal to tests");
        System.out.println("================");
        LessAndMore.LessOrMore(4, 1);       // more than
        LessAndMore.LessOrMore(32, 60);     // less than
        LessAndMore.LessOrMore(130, 130);   // equal to

        System.out.println("Even / Odd number tests");
        System.out.println("================");
        EvenOdd.EvenOrOdd(48);
        EvenOdd.EvenOrOdd(17);
    }
}
