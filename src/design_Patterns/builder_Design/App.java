package design_Patterns.builder_Design;

/*
 * Suppose object of cupboard
 * Door, material is permanent things. Every cupboard has this.
 * but mirror, wheel are optional things
 * So some cupboard have mirror some have wheels are some have al of this, some don`t have any of this
 * first approach will be creating constructor with different parameters. as shown in Cupboard_wrong_way
 * issue is for so many quantities there will be many constructors.
 * So solve this issue builder design pattern will be used
 *
 * so builder class will give object with rewired parameters
 * builder class is inside that class, and it is static
 * */
public class App {

    public static void main(String[] args) {
        Cupboard.Builder mybuilder = new Cupboard.Builder();
        Cupboard myHall = mybuilder.doorType("First").materialType("Wood").buildCupboard();
        Cupboard myRoom = mybuilder.doorType("Two").materialType("Plastic").wheelsType("Two").mirrorType("Full").buildCupboard();
        Cupboard myKitchen = mybuilder.doorType("Third").materialType("Metal").wheelsType("Four").buildCupboard();


        System.out.println("My Room Cupboard : "+myRoom.getDoorType()+", "+myRoom.getMaterialType()+", "+myRoom.getMirrorType()+", "+myRoom.getWheelsType()+", ");
        System.out.println("My Kitchen Cupboard : "+myKitchen.getDoorType()+", "+myKitchen.getMaterialType()+", "+myKitchen.getWheelsType()+", ");
    }


}
