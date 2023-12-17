package Basic.collectionframweork.arraylisteg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GloseryList {
    List<String> glolist=new ArrayList<String>();

    public void add(String item) {
        glolist.add(item);
        System.out.println("adding");
    }

    public void remove(int number) {
        glolist.remove(number-1);
        System.out.println("remove");
        printAll();
    }

    public void update(int number,String item) {
        glolist.add(number+1,item);
        System.out.println("update");
    }

    public void show() {
        printAll();
        System.out.println("show");
    }

    public void removeAll() {
        glolist.removeAll(glolist);
        System.out.println("removed all");
    }
    public void printAll() {
        for(int i=0;i<glolist.size();i++) {
            System.out.println((i+1)+"] "+ glolist.get(i));
        }}
}
