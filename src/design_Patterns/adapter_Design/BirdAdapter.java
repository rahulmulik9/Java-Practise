package design_Patterns.adapter_Design;

public class BirdAdapter  {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }


    public void squeak() {
        bird.fly();
    }
}
