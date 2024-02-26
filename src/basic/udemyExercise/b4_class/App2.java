package basic.udemyExercise.b4_class;

public class App2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.instanceMethod();
        a.staticMethod(); // [or] Animal.instanceMethod();
    }
}

class Animal {
    void instanceMethod() {
        System.out.println("instance method in Animal");
    }

    static void staticMethod() {
        System.out.println("static method in Animal");
    }
};

class Dog extends Animal {
    void instanceMethod() {
        System.out.println("instance method in Dog");
    }//overriding

    static void staticMethod() {
        System.out.println("static method in Dog");
    }//hiding

};

