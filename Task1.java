/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1;

/**
 *
 * @author bharth raj
 */
import java.util.Scanner;

public class Task1 {

    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Basic Calculator ===");

        while (keepRunning) {
            // Input numbers
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Input operator
            System.out.print("Choose operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;

            // Call appropriate method
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue; // skip rest and restart loop
            }

            System.out.println("Result: " + result);

            // Ask if user wants to continue
            System.out.print("Do you want to perform another calculation? (y/n): ");
            char choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                keepRunning = false;
                System.out.println("Exiting calculator... Goodbye!");
            }
        }

        sc.close();
    }
} 
