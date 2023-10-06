
package view;

import java.util.Scanner;
import model.CalculatorModel;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public int getMenuChoice() {
        System.out.println("Select an option:");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        return scanner.nextInt();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public void displayBMIStatus(CalculatorModel.BMIStatus status) {
        System.out.println("BMI Status: " + status);
    }

    public double getInputNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public String getInputOperator(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public void closeScanner() {
        scanner.close();
    }
}

