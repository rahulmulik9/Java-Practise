package basic.DataStructure.Mapeg.example1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Location> loca = new HashMap<Integer, Location>();


        loca.put(0, new Location(1, "My house locayion"));
        loca.put(1, new Location(2, "My school locayion"));
        loca.put(2, new Location(3, "My collage locayion"));
        loca.put(3, new Location(4, "My class locayion"));


        for (Map.Entry<Integer, Location> entry : loca.entrySet()) {
            System.out.println(entry.getValue().getDescription());
        }

        System.out.println("                    ");
        for (int i = 0; i < loca.size(); i++) {
            System.out.println(loca.get(i).getDescription());
        }

    }
}
