package basic.b2_OPPS_Concepts.inheritance.ConeptsFromPrototech.ReaderClass.MethodCalling;
/*Suppose you want implementation some method
* Here getAge will be overridden
* But that getAge(From child class) is calling from parent class another method*/

class ParentReader{
    public void getAge(){
        System.out.println("Parent class implementation ");
    }

    public void runMethod(){
        System.out.println("Run method called from Parent ");
        getAge();
    }
}

class GLTFReader extends ParentReader{
    @Override
    public void getAge() {
        //super.getAge();   //do this if you want to run parent class
        System.out.println("Child GLTF class implementation ");
     }
}

class StepReader extends ParentReader{
    @Override
    public void getAge() {
        //super.getAge();   //do this if you want to run parent class
        System.out.println("Child step class implementation ");
    }
}



public class Main {
    public static void main(String[] args) {

        ParentReader reader;
        boolean isGLTFFile = true;

        if(!isGLTFFile){
            reader = new StepReader();
        }else {
            reader = new GLTFReader();
        }
        reader.runMethod();
    }
}
