public class Calculator {

    static double answer;

    public static String[] calculations = {"Addition", "Subtraction", "Multiplication", "Division", "Modulus",
            "Exponentiation", "Square Root", "Factorial" };      // best practice for long array code?

    public static void Addition(double num_1, double num_2){
        answer = num_1 + num_2;
        System.out.println(num_1 " + " num_2 " = " + answer);
    }

    public static void Subtraction(double num_1, double num_2){
        answer = num_1 - num_2;
        System.out.println(num_1 " - " num_2 " = " + answer);
    }

    public static void Multiplication(double num_1, double num_2){
        answer = num_1 * num_2;
        System.out.println(num_1 " x " num_2 " = " + answer);
    }

    public static void Division(double num_1, double num_2){
        answer = num_1 / num_2;
        System.out.println(num_1 " ÷ " num_2 " = " + answer);
    }

    public static void Modulus(double num_1, double num_2){
        answer = num_1 % num_2;
        System.out.println("The remainder of " + num_1 + " ÷ " + num_2 +  " is: " + answer);
    }

    public static void Exponentiation(double num_1, double num_2){

        double answer = Math.pow(num_1, num_2);

        System.out.println(num_1 + " to the power of " + num_2 + " is: " + answer);
    }

    public static void SquareRoot(double num){

        double answer = Math.sqrt(num);

        System.out.println("The square root of " + num + " is: " + answer);
    }
    
    public static void Factorial(int num){

        int answer=1;
        if(num>0)
        {
            for (int i = num; i > 0; i--) {
                answer=answer*i;
            }
        }
        System.out.println("The factorial of " + num + " is: " + answer);
    }
    
}
