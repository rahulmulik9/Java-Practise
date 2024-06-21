package basic.b8_interface.functionalinterface.predicate.example;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {

        List<Employee> theEmployees = Arrays.asList(new Employee("A",12000),
                new Employee("B",13000),
                new Employee("C",14000),
                new Employee("D",16000),
                new Employee("E",17000));


        Map<Boolean,List<Employee>> sortedEmployees = theEmployees.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>13500));

        System.out.println("Salary greater than 13500");
        sortedEmployees.get(true).forEach(System.out::println);

        System.out.println("Salary less than 13500");
        sortedEmployees.get(false).forEach(System.out::println);
    }
}
