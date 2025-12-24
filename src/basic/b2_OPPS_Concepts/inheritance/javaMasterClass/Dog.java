package basic.b2_OPPS_Concepts.inheritance.javaMasterClass;

public class Dog extends Animal{
    //when you extend class Dog from Animal(Parent) it should contain constructor of parent variables also
//    public Dog(String name, int weight, int size) {
//        super(name, weight, size);
//    }

    //here suppose dog also have variable then in constructor all variables are passed
    //super keyword is used to initialise parent parameters
    private String breed;
    private int legs;

    public Dog(String name, int weight, int size, String breed, int legs) {
        super(name, weight, size);
        this.breed = breed;
        this.legs = legs;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void overloadMethod(String ab) {
        super.overloadMethod(ab);
        System.out.println("Dog override method is called");
    }
    public void callingParentMethod(){
        super.overloadMethod("Called");
    }
}
