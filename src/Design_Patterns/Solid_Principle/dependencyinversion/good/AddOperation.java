package Design_Patterns.Solid_Principle.dependencyinversion.good;

/**
 * So we will have this class but it will be taken care
 * via interface implementation.
 *
 */
public class AddOperation implements CalculatorOperation {
    public int calculate(int a, int b){

        System.out.println(a+b);
        return a+b;
    }
}
