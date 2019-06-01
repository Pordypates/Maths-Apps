public class Calculator {

    public static void Calculation(double num_1, double num_2, char operator) {

        double answer = 0;

        switch (operator) {
            case '+':
                answer = num_1 + num_2;
                break;
            case '-':
                answer = num_1 - num_2;
                break;
            case '*':
                answer = num_1 * num_2;
                break;
            case '/':
                answer = num_1 / num_2;
                break;
            case '%':
                answer = num_1 % num_2;
                break;
        }

        System.out.println("The calculation is: " + num_1 + " " + operator + " " + num_2 + " = " + answer);
    }

    public static void Exponentiation(double num_1, double num_2){

        double answer = Math.pow(num_1, num_2);

        System.out.println(num_1 + " to the power of " + num_2 + " is: " + answer);
    }
}
