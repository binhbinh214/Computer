
package controller;

import model.CalculatorModel;
import view.Menu;

public class CalculatorController {
    private Menu view;
    private CalculatorModel model;

    public CalculatorController(Menu view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void runCalculator() {
        boolean running = true;

        while (running) {
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    double num1 = view.getInputNumber("Enter first number: ");
                    String operatorStr = view.getInputOperator("Enter operator (+, -, *, /, ^): ");
                    CalculatorModel.Operator operator = checkOperator(operatorStr);
                    if (operator != null) {
                        double num2 = view.getInputNumber("Enter second number: ");
                        double result = model.calculate(num1, operator, num2);
                        view.displayResult(result);
                    } else {
                        System.out.println("Invalid operator. Please try again.");
                    }
                    break;
                case 2:
                    double weight = view.getInputNumber("Enter your weight (kg): ");
                    double height = view.getInputNumber("Enter your height (m): ");
                    CalculatorModel.BMIStatus bmiStatus = model.calculateBMI(weight, height);
                    view.displayBMIStatus(bmiStatus);
                    break;
                case 3:
                    view.closeScanner();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private CalculatorModel.Operator checkOperator(String operatorStr) {
        switch (operatorStr) {
            case "+":
                return CalculatorModel.Operator.ADD;
            case "-":
                return CalculatorModel.Operator.SUBTRACT;
            case "*":
                return CalculatorModel.Operator.MULTIPLY;
            case "/":
                return CalculatorModel.Operator.DIVIDE;
            case "^":
                return CalculatorModel.Operator.EXPONENT;
            default:
                return null;
        }
    }
}
   


