package com.company;

import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);
    static String validInput = "";

    public static void main(String[] args) {
        try{
            promptString();
        }catch (Exception e){
            System.out.println("Your string value is: " + validInput);
        }
        promptInt();
        promptDouble();

    }


    public static String promptString() {
        boolean pass = true;
        String string ="";
        while (pass) {

                System.out.println("Enter a string value:");
                string = input.nextLine();
                validInput = string;
                Double.parseDouble(string);

        }
        return string;
    }
    public static int promptInt(){
        boolean pass = true;
        int integer = 0;
        while (pass) {

            try {
                System.out.println("Enter a int ");
                integer = input.nextInt();
                pass = false;
            } catch (Exception e) {
                input.next();
                System.out.println("Please enter a valid integer! ");
                pass = true;
            }
            System.out.println("Your integer is: " + integer);

        }
        return integer;
    }
    public static double promptDouble(){
        boolean pass = true;
        double number2 = 0;
        while (pass) {

            try {
                System.out.println("Enter a double ");
                number2 = input.nextDouble();
                pass = false;
            } catch (Exception e) {
                input.next();
                System.out.println("Please enter a valid double! ");
                pass = true;

            }
            System.out.println("Your double is: " + number2);

        }
        return number2;
    }

}
