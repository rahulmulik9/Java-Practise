package basic.UDEMYJAVADATASTRUCTURE.Recursion;

public class Rcer {
    public void show(int a){

            if (a == 0) {
                System.out.println("The end");
            } else {
                System.out.println(a);
                show(a - 2);
            }
    }
}


//print even number upto given number
//
//public class Rcer {
//    public void show(int a){
//        if(a%2 == 0) {
//            if (a == 0) {
//                System.out.println("The end");
//            } else {
//                System.out.println(a);
//                show(a - 2);
//            }
//        }else {
//            int b=a-1;
//            if (b == 0) {
//                System.out.println("The end");
//            } else {
//                System.out.println(b);
//                show(b - 2);
//            }
//
//        }
//    }
//}
