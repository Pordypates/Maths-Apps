public class Calculator {
    public static void Calculation(int num_1, int num_2, char operator) {

        int answer = 0;

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
        }

        // how would I implement a power of function? (method overloading??)

        System.out.println("The calculation is: " + num_1 + " " + operator + " " + num_2 + " = " + answer);
    }
}
