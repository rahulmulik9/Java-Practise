package basic.b2_OPPS_Concepts.generic;

public class Park extends Point {

    private String name;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}
