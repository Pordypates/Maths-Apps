public class LessAndMore {

    public static void LessOrMore(int num_1, int num_2) {       //static because it doesn't need to be instantiated

        if (num_1 > num_2) {
            System.out.println(num_1 + " is more than " + num_2 + "!");
        } else if (num_1 < num_2) {
            System.out.println(num_1 + " is less than " + num_2 + "!");
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}

