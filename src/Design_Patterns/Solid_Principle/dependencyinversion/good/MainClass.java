package Design_Patterns.Solid_Principle.dependencyinversion.good;

public class MainClass {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.calculate(4,10,new AddOperation());
    }
}
