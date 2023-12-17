package design_Patterns.bridge_Design;
/*
 *The Bridge design pattern allows you to separate the abstraction from the implementation. It is a structural design pattern.

 * Elements of Bridge Design Pattern
 * Abstraction – core of the bridge design pattern and defines the crux. Contains a reference to the implementer.
 * Refined Abstraction – Extends the abstraction takes the finer detail one level below. Hides the finer elements from implementers.
 * Implementer – It defines the interface for implementation classes. This interface does not need to correspond directly to the abstraction interface and can be very different.
 * Abstraction imp provides an implementation in terms of operations provided by the Implementer interface.
 * Concrete Implementation – Implements the above implementer by providing the concrete implementation.
 */


public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
