package basic.classoopsconcepts.compositiion.part1;

public class Motherboard {
    private String model;
    private String manufacture;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacture, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgramm(String programName){
        System.out.println("Programm "+programName+" is loading");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(int cardSlot) {
        this.cardSlot = cardSlot;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
