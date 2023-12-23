package basic.b2_OPPS_Concepts.compositon;

public class MotherBoard {
    private String model;
    private String manufacture;
    private int ramSlot;
    private String bios;

    public MotherBoard(String model, String manufacture, int ramSlot, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlot = ramSlot;
        this.bios = bios;
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

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
    public void getMotherBorad (){
        System.out.println(model+" "+manufacture+" "+ramSlot+" "+bios);
    }


}
