package basic.udemyExercise.challenge2_ineritance;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int geras;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size,  int wheels, int doors, int geras, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.geras = geras;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("current gear is set to +" + this.currentGear);
    }

    public void changeVelocity(int speed, int dirction) {
        move(speed, dirction);
        System.out.println("Changed velocity " + speed + " Direction " + dirction);

    }

}
