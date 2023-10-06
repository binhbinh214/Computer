
package model;

public class CalculatorModel {
    public enum Operator { ADD, SUBTRACT, MULTIPLY, DIVIDE, EXPONENT }

    public double calculate(double a, Operator operator, double b) {
        double result = 0.0;
        switch (operator) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b != 0) {
                    result = a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                break;
            case EXPONENT:
                result = Math.pow(a, b);
                break;
        }
        return result;
    }

    public enum BMIStatus {
        UNDER_STANDARD, STANDARD, OVERWEIGHT, FAT_SHOULD_LOSE_WEIGHT, VERY_FAT_SHOULD_LOSE_WEIGHT_IMMEDIATELY
    }

    public BMIStatus calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 19) {
            return BMIStatus.UNDER_STANDARD;
        } else if (bmi >= 19 && bmi <= 25) {
            return BMIStatus.STANDARD;
        } else if (bmi > 25 && bmi <= 30) {
            return BMIStatus.OVERWEIGHT;
        } else if (bmi > 30 && bmi <= 40) {
            return BMIStatus.FAT_SHOULD_LOSE_WEIGHT;
        } else {
            return BMIStatus.VERY_FAT_SHOULD_LOSE_WEIGHT_IMMEDIATELY;
        }
    }
}

