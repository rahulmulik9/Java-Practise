package basic.b4_interface;

public class AdapterClass {
}

interface Message {
    void morn(); // by default public abstarct
    void eve();
    void night();
}

//Adapter class or Healer class
class HelperAdaptor implements Message {
    public void night() {
    }
    public void eve() {
    }
    public void morn() {
    }
}

class GoodStudent implements Message {
    public void morn() {
        System.out.println("good morning ratan");
    }
    public void eve() {
        System.out.println("good evening ratan");
    }
    public void night() {
        System.out.println("good nightratan");
    }
}
class Student implements Message {
    public void morn() {
        System.out.println("good morning ratan");
    }
    public void eve() {
        System.out.println("good evening ratan");
    }
    public void night() {
        System.out.println("good nightratan");
    }
}

class TestClient {
    public static void main(String[] args) {
        GoodStudent s = new GoodStudent();
        s.eve();
        s.morn();
        s.night();
        Student s1 = new Student();
        s1.morn();
    }
}
