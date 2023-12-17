package design_Patterns.bridge_Design;

class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}