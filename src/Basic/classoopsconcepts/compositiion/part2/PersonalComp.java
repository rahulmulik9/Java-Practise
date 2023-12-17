package Basic.classoopsconcepts.compositiion.part2;

public class PersonalComp {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public void powerUp() {
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //getMonitor().drawPixelAt(1200,50,"Red🚩");
        //you can driectly acess monitor
        monitor.drawPixelAt(1200,50,"Red🚩");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public PersonalComp(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
