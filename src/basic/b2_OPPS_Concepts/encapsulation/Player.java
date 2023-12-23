package basic.b2_OPPS_Concepts.encapsulation;

public class Player {
    private String name;
    private String weapon;
    private int health;


    public Player(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void damageHealth(int a) {
        health = health - a;
        if (a > 0) {
            System.out.println("Health remaining is " + health);
        } else {
            System.out.println("Player is dead");
        }
    }

    public int getHealth() {
        if (health > 0) {
            System.out.println(health);
            return health;
        } else {
            System.out.println("Health is zero");
            return 0;
        }
    }
}
