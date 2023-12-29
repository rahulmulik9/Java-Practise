package design_Patterns.builder_Design;

public class Cupboard {
    private String doorType;
    private String materialType;
    private String mirrorType;
    private String wheelsType;

    public Cupboard(Builder builder) {
        this.doorType = builder.doorType;
        this.materialType = builder.materialType;
        this.mirrorType = builder.mirrorType;
        this.wheelsType = builder.wheelsType;
    }

    public String getDoorType() {
        return doorType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public String getMirrorType() {
        return mirrorType;
    }

    public String getWheelsType() {
        return wheelsType;
    }


    //bulder class must be static and inside the class
    public static class Builder {
        private String doorType;
        private String materialType;
        private String mirrorType;
        private String wheelsType;

        public Cupboard buildCupboard(){
            return new Cupboard(this);
        }

        public Builder doorType(String doorType){
            this.doorType=doorType;
            return this;
        }
        public Builder materialType(String materialType){
            this.materialType=materialType;
            return this;
        }
        public Builder mirrorType(String mirrorType){
            this.mirrorType=mirrorType;
            return this;
        }
        public Builder wheelsType(String wheelsType){
            this.wheelsType=wheelsType;
            return this;
        }

    }

}
