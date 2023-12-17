package basic.DataStructure.stack.usingArray;

public class stck {

    int[] arry;
    int top;

    public stck(int size) {
        this.arry = new int[size];
        this.top =-1;
    }


    public void push(int data){
        if(top== -1){
            arry[0]=data;
            top++;
        }
        else {
            arry[top+1]=data;
            top++;
        }
    }


    public void display(){
        for (int a=top;a>=0;a--) {
            System.out.println(arry[a]);

        }
    }


}
