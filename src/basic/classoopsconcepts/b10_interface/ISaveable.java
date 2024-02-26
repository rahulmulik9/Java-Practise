package basic.classoopsconcepts.b10_interface;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
