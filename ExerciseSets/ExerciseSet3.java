package Exercises;
import java.util.*;

public class ExerciseSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter in a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter in an operation: ");
        String operation = sc.next();

        while (!operation.equals("+") && !operation.equals("-") &&
                !operation.equals("*") && !operation.equals("/")) {
            System.out.print("Please enter either +, -, *, or /");
            operation = sc.next();
        }

        System.out.print("Enter in another number: ");
        double num2 = sc.nextDouble();

        switch (operation) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            default -> System.out.println(num1 / num2);
        }
    }
}
