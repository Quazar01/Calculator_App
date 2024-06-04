package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         So here's the deal.
         TODO:
         - Get operation to perform from user.
         - validate it, and make a method of the operation.
         - more to come.
        */
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.println("""
                        Enter the operation you want to perform
                        (+, -, *, /) or type 'exit' to quit""");
                String operation = scanner.nextLine();

                if (operation.equalsIgnoreCase("exit")){
                    break;
                }

                switch (operation){
                    case "+":
                        //Do the addition magic.
                        System.out.println("Doing Addition");
                        break;
                    case "-":
                        // Do the subtraction magic.
                        System.out.println("Doing Subtraction");
                        break;
                    case "*":
                        // Do the multiplication magic.
                        System.out.println("Doing Multiplication");
                        break;
                    case "/":
                        // Again the magic goes in here.
                        System.out.println("Doing Subtraction");
                        break;
                    default:
                        System.out.println("Invalid operation!");
                }
            } catch (Exception e){
                // If something happened during performing the operation.
                System.out.println("Invalid input, try again.");
            }

        }
    }
}