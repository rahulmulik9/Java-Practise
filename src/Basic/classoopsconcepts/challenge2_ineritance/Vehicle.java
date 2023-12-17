package Basic.classoopsconcepts.challenge2_ineritance;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

    }

    public void steer(int direction){
        this.currentDirection=currentDirection+direction;
        System.out.println("steer at "+currentDirection+" in degree");
    }
    public void move(int velocity,int direction){
        currentDirection=direction;
        currentVelocity=velocity;
        System.out.println("Vehicle speed "+currentVelocity+" in direction "+currentDirection);
    }

    public void stop(){
        currentVelocity=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
