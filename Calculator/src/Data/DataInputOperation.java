package Data;

import java.util.Scanner;

public class DataInputOperation{
    
    public String dataInputOperation() {
        Scanner scanner = new Scanner(System.in);
        String operationSymbol = scanner.nextLine();
        if (operationSymbol.equals("+") || operationSymbol.equals("*") || operationSymbol.equals("/")) {
            return operationSymbol;
        } 
        else{
            System.out.println("Такой операции нет :(");
            return null;
        }

    }

}
