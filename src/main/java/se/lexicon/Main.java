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
                        addition(scanner);
                        
                        break;
                    case "-":
                        // Do the subtraction magic.
                        subtraction(scanner);
                        break;
                    case "*":
                        // Do the multiplication magic.
                        multiplication(scanner);
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

    public static void addition(Scanner scanner){
        System.out.println("Enter the numbers to add (seperated by spaces): ");
        String[] inputs = scanner.nextLine().split(" ");
        double sum = 0;

        // Take each number and add to the next one.
        for (String number : inputs) {
            sum += Double.parseDouble(number);
        }

        System.out.println("Result: " + sum);
    }


    private static void subtraction(Scanner scanner) {
        System.out.println("Enter numbers to subtract (separated by spaces):");
        String[] inputs = scanner.nextLine().split(" ");
        // Set the result as the first number.
        double result = Double.parseDouble(inputs[0]);
        // Subtract the next number from result, until we reach the end of the array.
        for (int i = 1; i < inputs.length; i++) {
            result -= Double.parseDouble(inputs[i]);
        }

        System.out.println("Result: " + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.print("Enter the first number:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("\nEnter the second number:");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("\nResult: " + (num1 * num2));
    }

}