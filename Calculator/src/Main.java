import Calculator.Calculator;
import Operations.Div;
import Operations.Mult;
import Operations.Operation;
import Operations.Sum;
import View.CalculatorView;

public class Main {
    public static void main(String[] args) throws Exception {
        CalculatorView view = new CalculatorView();

        String oper = view.operationPrint();
        if (oper == null)
            System.exit(0);    
        Double num1 = view.firstNum();
        if (num1 == null)
            System.exit(0); 
        Double num2 = view.seondNum();
        if (num2 == null)
            System.exit(0);
        

        Operation operation;
        switch (oper) {
            case "+":
                operation = new Sum();
                break;
            case "*":
                operation = new Mult();
                break;
            case "/":
                operation = new Div();
                break;
            default:
                return; 
        }

        Calculator calculator = new Calculator(operation);
        calculator.calculate(num1, num2);
        
    }
}
