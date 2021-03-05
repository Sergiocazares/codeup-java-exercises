import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 2;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        do {
//            System.out.print(i + "\n");
//            i += 2;
//        } while (i <= 100);

//Alter your loop to count backwards by 5's from 100 to -10.
//        do {
//            System.out.print(i + "\n");
//            i -= 5;
//        } while (i >= -10);

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.print(i + "\n");
//            i *= i;
//        } while (i  <= 1000000);

//Refactor the previous two exercises to use a for loop instead.
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.print(i + "\n");
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.print(i + "\n");
//        }
//
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.print(i + "\n");
//        }


//  Fizzbuzz
/*  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
    Write a program that prints the numbers from 1 to 100.
    For multiples of three: print “Fizz” instead of the number.
    For the multiples of five: print “Buzz”.
    For numbers which are multiples of both three and five: print “FizzBuzz”.
 */

//        for (int x = 1; x <= 100; x++) {
//            if (x % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (x % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (x % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(x);
//
//            }
//        }

//        Display a table of powers.
/*
    Prompt the user to enter an integer.
    Display a table of squares and cubes from 1 to the value entered.
    Ask if the user wants to continue.
    Assume that the user will enter valid data.
    Only continue if the user agrees to.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter a number? [y/n]");
        String userAnswer = sc.next();

//        if(userAnswer.equals("y")) {
//            System.out.println("What number would you like to go up to?");
//            int userNumber = sc.nextInt();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 0; i <= userNumber; i++) {
//                System.out.println("  " + i + "    |    " + (i * i) + "    |   " + (i * i * i));
//            }
//        }

//        boolean userResponse = true;
//
//        do{
//            System.out.println("What number would you like to go up to?");
//            int userNumber = sc.nextInt();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userNumber; i++) {
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//                System.out.printf("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Do you want to enter a number? [y/n]");
//            String userAnswer = sc.next();
//            if(!userAnswer.equalsIgnoreCase("y")) {
//                userResponse = false;
//            }
//        } while (userResponse);


/*
    Convert given number grades into letter grades.
    Prompt the user for a numerical grade from 0 to 100.
    Display the corresponding letter grade.
    Prompt the user to continue.
    Assume that the user will enter valid integers for the grades.
    The application should only continue if the user agrees to.
    Grade Ranges:
    A : 100 - 88
    B : 87 - 80
    C : 79 - 67
    D : 66 - 60
    F : 59 - 0
 */

        if (userAnswer.equals("y")) {
            System.out.println("Enter your grade for the semester.");
            int userGrade = sc.nextInt();

            if (userGrade <= 59) {
                System.out.println("Your grade is a F. Forget about it.");
            } else if ((userGrade >= 60) && (userGrade <= 66)) {
                System.out.println("Your grade is a D. Do better.");
            } else if ((userGrade >= 67) && (userGrade <= 79)) {
                System.out.println("Your grade is a C. Come on, is that the best you can do?");
            } else if ((userGrade >= 80) && (userGrade <= 87)) {
                System.out.println("Your grade is a B. Best grade you've gotten so far.");
            } else if ((userGrade >= 88) && (userGrade <= 100)) {
                System.out.println("Your grade is an A. Awesome!");
            }

        } else {
            System.out.println("Thanks! Come Again.");
        }
    }
}
