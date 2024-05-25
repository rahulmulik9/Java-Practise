package DataStructre.hashTable;

public class SimpleHashTable
{
    private Product[] hashtable;
    public SimpleHashTable(){
        hashtable = new Product[10];
    }
    private int hashKey(String key){
        //key can be anything
        //simple hashing function
        return key.length() % hashtable.length;
    }
    public Product get(String key){
        int hashkey=hashKey(key);
        return hashtable[hashkey];
    }
    public void put(String key, Product product){
        int hashkey = hashKey(key);
        if(hashtable[hashkey] != null){
            System.out.println("Sorry Product is already present");
        }else {
            hashtable[hashkey] = product;
        }
    }
    public void printTable(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

}
