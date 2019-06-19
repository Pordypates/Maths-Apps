import java.util.Scanner;

public class EvenOdd {

    static int number;

    public static void EvenOrOdd(){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the number to see whether it is even or odd.");

        number = myObj.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even!");
        } else{
            System.out.println("Number " + number + " is odd!");
        }

        EvenOrOdd();
    }
}
