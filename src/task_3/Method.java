package task_3;

import java.util.Scanner;

public class Method {

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            Interface <String> reverse = s -> new StringBuilder(s).reverse().toString();
            System.out.println("Enter sting to reverse:");
            scanner.nextLine();
            System.out.println(reverse.selectionOfType(scanner.nextLine()));
        } else if (choice == 2) {
            Interface <Integer> factorial = i -> {
                int result = 1;

                for (int k = 1; k <= i; ++k) {
                    result = k * result;
                }

                return result;
            };
            System.out.println("enter a number to calculate the factorial:");
            System.out.println(factorial.selectionOfType(scanner.nextInt()));
        } else {
            System.out.println("invalid number");
        }

        scanner.close();
    }

}
