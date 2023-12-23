package basic.b2_OPPS_Concepts.compositon;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacture, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power button is presed");
    }
    public void getCasendDimesnion(){
        System.out.println("Case dimension are");
        System.out.println(model+" "+manufacture+" "+powerSupply+""+dimension.getDimesion());
    }
}
