import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = in.next();
        boolean output = false;

        char first = input.charAt(0);

        if (Character.isDigit(first)) {
            output = true;
        } else {
            output = false;
        }
        System.out.println("Output Status is : " + output);
    }
}

