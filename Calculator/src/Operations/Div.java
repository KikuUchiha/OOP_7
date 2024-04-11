package Operations;
//деление
public class Div implements Operation {
    @Override
    public double operation(double a, double b) {
        if (b == 0){ 
            System.out.println("Нельзя делить на 0! :(");
            System.exit(0);
            return b;
        }
        else 
            return a / b;
    }
}
