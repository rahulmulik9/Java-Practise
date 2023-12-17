package basic.classoopsconcepts.compositiion.part1;

public class Main {
    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("Inspiron", "Dell", "350", dimensions);

        Monitor theMonitor = new Monitor("23inch", "Benq", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("HomeWork", "dell", 4, 6, "v2.35");

        PersonalComp pc = new PersonalComp(theCase, theMonitor, theMotherboard);
        pc.getMonitor().drawPixelAt(1500, 1200, "red🚩 ");
        pc.getMotherboard().loadProgramm("Windows 11");
        pc.getTheCase().pressPowerButton();

    }
}
