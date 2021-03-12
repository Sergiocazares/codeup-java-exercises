package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    //Has to be in a constructor method, Java rule. All functionality happens in the methods.
    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return getString("Type out a sentence.");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Yes or No?");
    }


    //Prompt Bonus
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userString = this.sc.nextLine();
        if(userString.equalsIgnoreCase("y") || userString.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        int userInput = sc.nextInt();

        if((userInput < min) || (userInput > max)) {
            System.out.println("You did it wrong! Try again.");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        return getInt("Give me any number.");
    }

    //Prompt Bonus
    public int getInt(String prompt) {
        System.out.print(prompt);
        try {
            return Integer.valueOf(getString(" "));
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a number between %f and %f\n", min, max);
        double userInput = this.sc.nextDouble();
        if((userInput < min) || (userInput > max)) {
            System.err.println("You did it wrong! Try again.");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        try {
            return Double.valueOf(getString(" "));
        } catch (Exception e) {
            System.err.println("Invalid input, try again.");
            return getDouble(prompt);
        }
    }

    public double getDouble(){
        return getDouble("Give me any number with a decimal.");
    }

    public int getBinary(){
        try {
            return Integer.parseInt(getString("Enter a binary number."), 2);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input, try again.");
            return getBinary();
        }
    }


    public int getHexDecimal(){
        try {
            return Integer.parseInt(getString("Enter a hexadecimal number."), 16);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input, try again.");
            return getHexDecimal();
        }
    }
}
