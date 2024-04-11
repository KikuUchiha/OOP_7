package Data;

import java.util.Scanner;

public class DataInputNumber {

    public Double dataInputNumber() {
        Scanner scanner = new Scanner(System.in);//не могу его здесь закрыть
        if (scanner.hasNextDouble()) {
            Double number = scanner.nextDouble();
            return number;
        } 
        else {
            System.out.println("Вы ввели не число");
            return null;
        }
    }
        
    

}
