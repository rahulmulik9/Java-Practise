package basic.DataStructure.que.usingArray;

public class QueArray {
    int[] ary;
    int front;
    int rear;

    public QueArray(int size) {
        this.ary = new int[size];
        this.front = -1;
        this.rear = -1;
    }


    public void add(int data){
        if(front==-1 && rear==-1){
            ary[front+1]=data;
            front++;
            rear++;
        }
        else {
            rear++;
            ary[rear]=data;
        }
    }

    public void display() {
        for(int i=front;i<ary.length;i++){
            System.out.println(ary[i]);
        }
    }
}
