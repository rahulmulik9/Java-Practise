package Solid_Principle.Open_Closed_Principle;

public class _1OpenCLose {
    //Close for the modification but open for expansion
    //no one able to modified or change the method inside class but can extense class and can be add new functionlity

    //bad example
    //what if you have to change add multiplication and divider operation in the method then you have to
    //make changes in the class
    public int badcalculator(int a, int b, String operation) {

        int result = 0;
        switch (operation) {
            case "Sum":
                result = a + b;
            case "Subtraction":
                result = a - b;
        }
        return result;
    }

    //how to tackle this create interface , in that create method which will take two number then you can implment that interface
    //you can add your own method also and implement the same method
    //Also you can implement same method many time by implementing this class
    //name will be same but functionality are different


    //so we created Operation interface
    //public interface Operation {
    //    public int perform(int a, int b);
    //}

    //this is used by Addoperation
//    public class AddOperation implements Operation {
//        public int perform(int a, int b) {
//            return a+b;
//        }
//    }

    //so Operation class is open to extension but it can be close to modification



}
