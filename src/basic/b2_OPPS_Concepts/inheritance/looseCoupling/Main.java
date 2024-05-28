package basic.b2_OPPS_Concepts.inheritance.looseCoupling;


interface Engine {
    public void runEngine();
}

class DieselEngine implements Engine {
    @Override
    public void runEngine() {
        System.out.println("Diesel engine is running");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void runEngine() {
        System.out.println("Electric engine is running");
    }
}

/*Tight coupling
 * For each engine we have to design new class*/
class DieselCar {
    private DieselEngine dieselEngine;

    public DieselCar(DieselEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }
    public void runEngine(){
        dieselEngine.runEngine();
    }
}

class ElectricCar {
    private ElectricEngine electricEngine;

    public ElectricCar(ElectricEngine electricEngine) {
        this.electricEngine = electricEngine;
    }

    public ElectricEngine getElectricEngine() {
        return electricEngine;
    }
}

/*Loose coupling
 * Interface object , then assign that to required class*/
class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void runEngine() {
        engine.runEngine();
    }
}


public class Main {

    public static void main(String[] args) {
        //tight couple
        DieselCar dieselCar = new DieselCar(new DieselEngine());
        ElectricCar electricCar = new ElectricCar(new ElectricEngine());
        dieselCar.runEngine();
        electricCar.getElectricEngine().runEngine();

        //loose coupling
        Car dieselCar1 = new Car(new DieselEngine());
        Car electricCar1 = new Car(new ElectricEngine());
        dieselCar1.runEngine();
        electricCar1.runEngine();

    }

}
