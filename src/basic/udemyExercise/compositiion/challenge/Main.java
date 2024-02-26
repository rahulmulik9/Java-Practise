package basic.udemyExercise.compositiion.challenge;

//we are not extending the class
//we are accesing objects methods by using compmosition
//we can access by 1]using getter method
// or by using 2]callin gmethod from particular object in that object method

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");


        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("MOdern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("classic", false, 75);
        BedRoom bedRoom = new BedRoom("Hall", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        System.out.println("Here we are define Bed bed in variables and getter for that.\n BedRoom class have makeBed method in that method we ar calling bed.make() method which is in Bed class");
        bedRoom.makeBed();


        System.out.println(("Here we are define Lamp lmap in variables and getter for that. \n Usng this getter we can use method of Lam class(turnOn) in Bedroom class"));
        bedRoom.getLamp().turnON();

    }

}
