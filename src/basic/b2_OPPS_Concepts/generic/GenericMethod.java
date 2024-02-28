package basic.b2_OPPS_Concepts.generic;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {}
    //regular
    public void getAll(List<Employ> employ){}
    //Generic
    public <T>void getAllSt(List<T> name){}
    //if you want to use only for some class and its extended class
    public <T extends Men> void getAllMen(List<T> name){}
    //Wildcard
    public <T extends Employ> String getll(List<? extends Employ> name)
    {
        return "hi";
    }

}
interface Men{
    public void get();
}
class Employ{
    private String name;
    public Employ(String name) {this.name = name;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
