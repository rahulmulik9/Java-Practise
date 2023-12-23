package basic.b2_OPPS_Concepts.compositon;

import javax.sound.midi.Soundbank;

public class Monitor {
    private String model;
    private String manumfacture;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manumfacture, int size, Resolution resolution) {
        this.model = model;
        this.manumfacture = manumfacture;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManumfacture() {
        return manumfacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }


    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at" + x +" "+y + " with colur "+color);
    }

    public void getMonitorDetails(){
        System.out.println("Getting Monitor Deatails");
        System.out.println(model+" "+manumfacture+" "+size);
    }

    public void getMonitorndResolution(){
        System.out.println("Getting Monitor and Resolution Deatails using declared resolution variable ");
        System.out.println(model+" "+manumfacture+" "+size+" "+resolution.getDepth()+" "+resolution.getWidth());
    }
}
