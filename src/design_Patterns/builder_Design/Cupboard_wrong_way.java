package design_Patterns.builder_Design;

 class Cupboard_wrong_way {
    //constructor with different arguments
    private String doorType;
    private String materialType;
    private String mirrorType;
    private int wheels;

      //fixed things
    public Cupboard_wrong_way(String doorType, String materialType) {
        this.doorType = doorType;
        this.materialType = materialType;
    }

    //with mirror
    public Cupboard_wrong_way(String doorType, String materialType, String mirrorType) {
        this.doorType = doorType;
        this.materialType = materialType;
        this.mirrorType = mirrorType;
    }

    //with wheels
    public Cupboard_wrong_way(String doorType, String materialType, int wheel) {
        this.doorType = doorType;
        this.materialType = materialType;
        this.wheels = wheel;
    }

    //with all

    public Cupboard_wrong_way(String doorType, String materialType, String mirrorType, int wheels) {
        this.doorType = doorType;
        this.materialType = materialType;
        this.mirrorType = mirrorType;
        this.wheels = wheels;
    }



}


class Cupboard_s{

    private String doorType;
    private String materialType;
    private String mirrorType;
    private int wheels;

/////==============by using  constructor chaining

    public Cupboard_s(String doorType, String materialType) {
        this.doorType = doorType;
        this.materialType = materialType;
    }

    //with mirror
    public Cupboard_s(String doorType, String materialType, String mirrorType) {
     this(doorType,materialType);
        this.mirrorType = mirrorType;
    }

    //with wheels
    public Cupboard_s(String doorType, String materialType, int wheel) {
        this(doorType,materialType);
        this.wheels = wheel;
    }

    //with all

    public Cupboard_s(String doorType, String materialType, String mirrorType, int wheels) {
        this(doorType,materialType);
        this.mirrorType = mirrorType;
        this.wheels = wheels;
    }
}


