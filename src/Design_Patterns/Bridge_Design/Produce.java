package Design_Patterns.Bridge_Design;

class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}