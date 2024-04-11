package View;

import Data.DataInputNumber;
import Data.DataInputOperation;

public class CalculatorView {
    DataInputNumber number = new DataInputNumber();
    DataInputOperation oper = new DataInputOperation();

    public String operationPrint(){
        System.out.println("Введите символ, выполняемой операции(пример: + ; * ; / ): ");
        return oper.dataInputOperation();
    }

    public Double firstNum(){
        System.out.println("Введите первое число(пример: 12,54)");
        return number.dataInputNumber();
    }

    public Double seondNum(){
        System.out.println("Введите второе число(пример: -124)");
        return number.dataInputNumber();
    }

}
