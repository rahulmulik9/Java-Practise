package basic.b2_OPPS_Concepts.ClassTypes.Immutable;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Person[] kids;

    public void setKids(Person[] kids) {
        this.kids = kids;
    }

    public Person[] getKids() {
        return kids;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString(){
        String kidsName = "n/a";
        if(kids != null){
            String[] names = new String[kids.length];
            Arrays.setAll(names,i->names[i]=kids[i]==null?"":kids[i].name);
            kidsName = String.join(", ",names);
        }
        return kidsName;
    }
}
