package Basic.classoopsconcepts.overrideandoverload;

public class Child extends Parent{
    @Override
    public void name(String fname) {
        System.out.println("calling override method of parent class in child class"+fname);
    }
}
