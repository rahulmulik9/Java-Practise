package basic.b2_OPPS_Concepts.compositon;

public class App {
    public static void main(String[] args) {
        MotherBoard myBoard = new MotherBoard("Asus", "ElectronsME", 2, "1.346");

        //directly adding new class in constructor
        Monitor myMonitor = new Monitor("Tv", "Sony", 43, new Resolution(1080, 1920));

        //creating class dimension then adding to constructor
        Dimension myDemision = new Dimension(1800, 720, 10);
        Case myCase = new Case("Mine", "me", "Direct", myDemision);


        //adding all to pc
        PC myPc = new PC(myBoard, myCase, myMonitor);
        myPc.getCall();
        myPc.getM_case().getCasendDimesnion();
        myPc.getM_monitor().getMonitorDetails();
        myPc.getM_monitor().getMonitorndResolution();

    }
}
