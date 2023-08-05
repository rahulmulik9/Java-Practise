package Design_Patterns.Solid_Principle.dependencyinversion.good;

/**
 * As per DIP rule it states :
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * --- So low level is depdendent via CalculatorOperation rather being depend on add or substract operations.
 * Abstractions should not depend on details. Details should depend on abstractions
 * ---Abstraction is achieved as via interface we are entering in low level.
 */

/*
* So we created method in calculator class and it will return result by identifying which class is passded throught the method
* CalculatorOPeratin operation => if pass here new Addoperation it will return addition
* see main class for explaintion
* */
public class Calculator {
    public int calculate(int a,int b, CalculatorOperation operation)
    {
        return operation.calculate(a,b);
    }
}
