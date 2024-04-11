package Calculator;

import Operations.Div;
import Operations.Mult;
import Operations.Operation;
import Operations.Sum;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        double result = operation.operation(a, b);
        System.out.println(String.format("Выполненная операция: %.2f %s %.2f = %.2f", a, getOperationSymbol(), b, result));
        return result;
    }

    private String getOperationSymbol() {
        if (operation instanceof Sum) {
            return "+";
        } else if (operation instanceof Mult) {
            return "*";
        } else if (operation instanceof Div) {
            return "/";
        }
        return "";
    }
}
