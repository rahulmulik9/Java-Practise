package basic.b2_OPPS_Concepts.encapsulation;

public class App {
    public static void main(String[] args) {
        Player hero = new Player("David","Gun",100);
        hero.damageHealth(50);
        hero.getHealth();
        hero.damageHealth(60);
        hero.getHealth();
    }
}
