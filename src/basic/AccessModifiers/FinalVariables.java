package basic.AccessModifiers;

//can you declare variable as final and initialise it later
//Ans : Yes
//IF it is static then initialise it in static block
//If it is member variable then declared in constructor.
//If it is local then initialise it in method itself


public class FinalVariables {
    public static void main(String[] args) {

    }
}

class FinalVaribles {
    //IF it is static then initialise it in static block
    public static final int MAX_VALUE;

    static {
        MAX_VALUE = 100;
    }

    //If it is member variable then declared in constructor.
    private final int MAX_INT;
    public FinalVaribles() {
        MAX_INT = 100;
    }

}
