package Exercises;

import java.util.*;

public class ExerciseSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateSquareDim(sc);
        greetUser(sc);
        classifyTriangle(sc);
        convertToSeconds(sc);
        max(sc);
        calculateVolume(sc);
        problem8(sc);
    }

    public static void calculateSquareDim(Scanner sc) {
        System.out.print("Please input the length of one side of a square: ");
        double length = sc.nextDouble();
        System.out.println("The area is " + (length * length) + " square" +
                " units. The perimeter is " + (length * 4) + " units.");
    }

    public static void greetUser(Scanner sc) {
        System.out.print("Please enter your first name: ");
        String firstName = sc.next();
        System.out.print("Please enter your last name: ");
        String lastName = sc.next();

        System.out.println("Welcome, " + firstName + " " + lastName);
    }

    public static void classifyTriangle(Scanner sc) {
        System.out.print("Please enter one side of a triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Please enter another side of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Please enter the last side of the triangle: ");
        double side3 = sc.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle.");
        } else if (side1 != side2 && side2 != side3 && side1 != side3) {
            System.out.println("This is a scalene triangle.");
        } else {
            System.out.println("This is an isosceles triangle.");
        }
    }

    public static void convertToSeconds(Scanner sc) {
        System.out.print("Please enter a number of days: ");
        int days = sc.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        if (days == 1) {
            System.out.println("There are " + seconds + " seconds in " + days + " day.");
        } else {
            System.out.println("There are " + seconds + " seconds in " + days + " days.");
        }
    }

    public static void max(Scanner sc) {
        System.out.print("Please enter a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Please enter another number: ");
        double num2 = sc.nextDouble();
        System.out.print("Please enter another number: ");
        double num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number.");
        } else {
            System.out.println(num3 + " is the greatest number.");
        }
    }

    public static void calculateVolume(Scanner sc) {
        System.out.print("Please enter the radius of a cube: ");
        double radius = sc.nextDouble();
        double length = radius * 2;
        double volume = length * length * length;
        System.out.println("The volume of the cube is " + volume + " cubic units.");
    }

    public static void problem8(Scanner sc) {
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        if (n < 10) {
            n = (n * 3) + 2;
        } else {
            n = (n * 10) - 10;
        }

        System.out.println("The new number is " + n + ".");
    }
}

