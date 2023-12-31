package design_Patterns.solid_Principle.Interfac_Segregation;

public class App {


    /*Interface should not force class to implement what they cant do */

    //suppose there is interface waterAnimals with method getSwimSpeed
    //You make object of fish and implement this interface
    //now you have to make object of turtle and turtle can walk also,
    //so you cant create getWalkSeed method in waterAnimal interface as other water animal(fish) cant do that
    //so create another interface with canWalk method and implement it in turtle class

}

interface WaterAnimal {
    public String getSwimSpeed();

    //wrong => as all animal in water class cant walk so you cant implement this on every class
    // Interface should not force class to implement what they cant do
    // instead create another interface
    //public String getWalkSpeed();
}


class Fish implements WaterAnimal {
    String speed = "10kmph";

    @Override
    public String getSwimSpeed() {
        return speed;
    }
}

interface OtherProperties{
    public String getWalkSpeed();
}

class Turtle implements WaterAnimal,OtherProperties{
    String speed = "1kmph";
    String walkSpeed="0.01Kpmlh";
    @Override
    public String getSwimSpeed() {
        return speed;
    }

    @Override
    public String getWalkSpeed() {
        return walkSpeed;
    }
}
