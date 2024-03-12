package basic.b2_OPPS_Concepts.ClassTypes.Immutable;

public class App {
    public static void main(String[] args) {
        Person kid1 = new Person("A1", 20);
        Person kid2 = new Person("A2", 25);
        Person kid3 = new Person("A3", 30);
        Person parent = new Person("P", 65);
        parent.setKids(new Person[]{kid1, kid2, kid3});
        System.out.println(parent.toString());

        //This below method can change the child of the parent
        parent.setKids(new Person[]{new Person("C1",5),new Person("C2",8)});
        System.out.println(parent.toString());

        Person[] parentchild = parent.getKids();
        parentchild[0] = new Person("B1",5);
        System.out.println(parent.toString());
    }
}


