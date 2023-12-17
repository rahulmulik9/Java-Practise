package Basic.classoopsconcepts.compositiion.challenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int globalrating;
    public void turnON(){
        System.out.println("Lamp turning on");

    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalrating() {
        return globalrating;
    }

    public Lamp(String style, boolean battery, int globalrating) {
        this.style = style;
        this.battery = battery;
        this.globalrating = globalrating;
    }
}
