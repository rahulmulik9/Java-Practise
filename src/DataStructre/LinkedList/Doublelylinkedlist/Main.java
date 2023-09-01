package DataStructre.LinkedList.Doublelylinkedlist;

import DataStructre.LinkedList.Doublelylinkedlist.Employee;
import DataStructre.LinkedList.Doublelylinkedlist.EmployeeLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "abc");
        Employee emp2 = new Employee(2, "xyz");
        Employee emp3 = new Employee(3, "pqr");
        Employee emp4 = new Employee(4, "mno");

        EmployeeLinkedList newlist = new EmployeeLinkedList();
        newlist.addToFront(emp1);
        newlist.addToFront(emp2);
        newlist.addToFront(emp3);
        newlist.addToFront(emp4);

        System.out.println(newlist.deletFront());
        System.out.println(newlist.deletFront());
        System.out.println(newlist.deletFront());
        System.out.println(newlist.deletFront());
        System.out.println(newlist.deletFront());

    }
}
