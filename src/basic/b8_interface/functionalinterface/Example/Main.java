package basic.b8_interface.functionalinterface.Example;

interface Calculator{
    public int getAddition(int a, int b);

}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int getAddition(int a, int b) {
                return a+b;
            }
        };

        Calculator calculator1 = (a,b)->a+b;
        Calculator calculator3 = Integer::sum;

        int sum = calculator.getAddition(5,7);
        int sum1= calculator1.getAddition(6,8);

        int sum2 = new Calculator(){
            @Override
            public int getAddition(int a, int b) {
                return a+b;
            }
        }.getAddition(7,9);

        System.out.println(sum+", "+sum1+", "+sum2);



    }
}
