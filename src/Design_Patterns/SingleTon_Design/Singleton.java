package Design_Patterns.SingleTon_Design;

public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }
//    public static Singleton getInstance(String data){
//        if(instance != null){
//        instance = new Singleton(data);}
//        return instance;
//    }

    // two threads from accessing code at same time from above getInstance method code.
    //use synchronized
    // thread will wait until there turn comes up
    //in this methos there is thread waiting
    public static Singleton getInstance(String data) {
        synchronized (Singleton.class) {
            if (instance != null) {
                instance = new Singleton(data);
            }
            return instance;
        }
    }



}
