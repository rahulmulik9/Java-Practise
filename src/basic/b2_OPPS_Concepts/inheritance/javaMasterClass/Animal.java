package basic.b2_OPPS_Concepts.inheritance.javaMasterClass;

public class Animal {
    private String name;
    private int weight;
    private int size;

    public Animal(String name, int weight, int size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void testMethod(String abc){
        System.out.println(abc);
    }

    public void overloadMethod(String ab){
        System.out.println("Animal class method is called");
        System.out.println("using super.overloadMethod(ab) in dog override method ");
    }
}
