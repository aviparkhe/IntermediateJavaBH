package Exercises;
import java.util.*;

public class ExerciseSet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exercise01();
        exercise02();
        exercise03();
        exercise04();
        exercise05(sc);
        exercise06(sc);
        exercise07(sc);
        exercise08(sc);
        exercise09(sc);
        exercise10(sc);
        exercise11(sc);
        exercise12(sc);
        exercise13(sc);
        exercise14(sc);
    }

    public static void exercise01() {
        // Print every other number from 30 to 300
        for (int i = 30; i <= 300; i += 2) {
            System.out.println(i);
        }
    }

    public static void exercise02() {
        // Print every number from 500 to 30
        for (int i = 500; i >= 30; i--) {
            System.out.println(i);
        }
    }

    public static void exercise03() {
        // Print every 3rd number from 1000 to 1
        for (int i = 1000; i > 0; i -= 3) {
            System.out.println(i);
        }
    }

    public static void exercise04() {
        // Print every multiple of 3 from 1 to 15
        for (int i = 3; i <= 15; i += 3) {
            System.out.println(i);
        }
    }

    public static void exercise05(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        int itemCount = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] <= 100 && vals[i] >= 10) {
                itemCount++;
            }
        }

        System.out.println("There were " + itemCount + " numbers in between 10 and 100");
    }

    public static void exercise06(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double sum = 0;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }

        System.out.println(sum);
    }

    public static void exercise07(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double product = 1;
        for (int i = 0; i < vals.length; i++) {
            product *= vals[i];
        }

        System.out.println(product);
    }

    public static void exercise08(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double sum = 0;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }

        Boolean sumIsTen = sum == 10;
        Boolean tenIsPresent = vals[0] == 10 || vals[1] == 10 || vals[2] == 10 || vals[3] == 10 || vals[4] == 10;

        if (tenIsPresent && sumIsTen) {
            System.out.println("10 is present in the list.");
        } else {
            System.out.println("10 is not present in the list.");
        }
    }

    public static void exercise09(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double sum = 0;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }

        Boolean sumIsTen = sum == 10;
        Boolean tenIsPresent = vals[0] == 10 || vals[1] == 10 || vals[2] == 10 || vals[3] == 10 || vals[4] == 10;

        if (tenIsPresent || sumIsTen) {
            System.out.println("10 is present in the list.");
        } else {
            System.out.println("10 is not present in the list.");
        }
    }

    public static void exercise10(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        if (vals[0] == vals[vals.length - 1]) {
            System.out.println("The first and last items are equal to each other.");
        } else {
            System.out.println("The first and last items are not equal.");
        }
    }

    public static void exercise11(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        int itemCount = 0;
        for (int i = 0; i < vals.length; i++) {
            if ((vals[i] <= 100 && vals[i] >= 10) || (vals[i] <= 200 && vals[i] >= 10)) {
                itemCount++;
            }
        }

        System.out.println(itemCount);
    }

    public static void exercise12(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double[] reversed = {0, 0, 0, 0, 0};
        for (int i = 0; i < vals.length; i++) {
            reversed[i] = vals[vals.length - (i + 1)];
        }

        System.out.println(Arrays.toString(reversed));
    }

    public static void exercise13(Scanner sc) {
        double[] vals = enterFiveDecimalNumbers(sc);

        double sum = 0;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }

        if (sum < 50) {
            System.out.println("The total sum is less than 50.");
        } else if (sum == 50) {
            System.out.println("The total sum is equal to 50.");
        } else {
            System.out.println("The total sum is greater than 50.");
        }
    }

    public static void exercise14(Scanner sc) {
        System.out.print("Please enter in a recent exam score out of 80: ");
        double score = sc.nextDouble();

        double[] percentGradeOrder = {60, 70, 80, 90}; // min grade for letters

        double percentGrade = (score * 100) / 80;

        double toNextGrade = 0;
        String letterGrade;
        if (percentGrade >= 90) {
            letterGrade = "A";
        } else if (percentGrade >= 80) {
            letterGrade = "B";
            toNextGrade = percentGradeOrder[3] - percentGrade;
        } else if (percentGrade >= 70) {
            letterGrade = "C";
            toNextGrade = percentGradeOrder[2] - percentGrade;
        } else if (percentGrade >= 60) {
            letterGrade = "D";
            toNextGrade = percentGradeOrder[1] - percentGrade;
        } else {
            letterGrade = "F";
            toNextGrade = percentGradeOrder[0] - percentGrade;
        }
        double nextGradeScore = toNextGrade * 80 / 100 ;

        System.out.println("You got a " + percentGrade + "% (" + letterGrade + ") on the exam.");
        System.out.println("To get to the next grade, you would have needed to get " + nextGradeScore + "/80 points.");



        // Grades
        // A - 90% and above
        // B - 80% to 89.99%
        // C - 70% to 79.99%
        // D - 60% to 69.99%
        // F - 59.99% and below
    }

    public static double[] enterFiveDecimalNumbers(Scanner sc) {
        System.out.print("Please enter a decimal number: ");
        double dec1 = sc.nextDouble();
        System.out.print("Please enter another decimal number: ");
        double dec2 = sc.nextDouble();
        System.out.print("Please enter another decimal number: ");
        double dec3 = sc.nextDouble();
        System.out.print("Please enter another decimal number: ");
        double dec4 = sc.nextDouble();
        System.out.print("Please enter another decimal number: ");
        double dec5 = sc.nextDouble();

        return new double[] {dec1, dec2, dec3, dec4, dec5};
    }
}
