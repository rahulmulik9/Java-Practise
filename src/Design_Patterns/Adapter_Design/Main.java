package Design_Patterns.Adapter_Design;

public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        BirdAdapter birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();

        //in sueak method we are calling sparrow fly method
        // so output will be flying

    }





}
