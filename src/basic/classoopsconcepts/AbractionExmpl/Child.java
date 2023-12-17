package basic.classoopsconcepts.AbractionExmpl;

public class Child extends Abstrct{
    @Override
    public void display() {
        System.out.println("Abstract Method is called");
    }

    @Override
    public void name() {
        super.name();
    }
}
