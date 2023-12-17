package design_Patterns.adapter_Design;

public class Sparrow implements Bird {

    public void fly()
    {
        System.out.println("Flying");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
}
