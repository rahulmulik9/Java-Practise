package Design_Patterns.Adapter_Design;

public class BirdAdapter  {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }


    public void squeak() {
        bird.fly();
    }
}
