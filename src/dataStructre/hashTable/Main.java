package DataStructre.hashTable;

public class Main {
    public static void main(String[] args) {
        Product p1= new Product("abc", 1);
        Product p2= new Product("xyz", 2);
        Product p3= new Product("pqr", 3);
        Product p4= new Product("mno", 4);

        SimpleHashTable ht= new SimpleHashTable();
        ht.put("p1",p1);
        ht.put("pr2",p2);
        ht.put("pro3",p3);
        ht.put("prod4",p4);
        ht.printTable();
    }
}
