package TempPractise.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> theList = new ArrayList<>();
        theList.add(new Employee(1,"Rahul"));
        theList.add(new Employee(2,"Abhi"));
        theList.add(new Employee(3,"Ram"));


        theList.stream().forEach( emp->System.out.println(emp));
        Collections.sort(theList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId()- o2.getId();
            }
        });


        theList.stream().forEach( emp->System.out.println(emp));
        Collections.sort(theList,new NameCompare());
        theList.stream().forEach( emp->System.out.println(emp));

    }
}
