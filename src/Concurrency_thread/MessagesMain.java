package Concurrency_thread;

import java.util.Random;

public class MessagesMain {
    public static void main(String[] args) {

    }
}

class Meassage {
    private String msg;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {

        }
        empty = true;
        return msg;
    }

    public synchronized void writeMsg(String msg) {
        while (!empty) {
        }
        empty = false;
        this.msg = msg;
    }

}

class Writer implements Runnable {
    private Meassage msg;

    public Writer(Meassage msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String messages[] = {"abcxyz", "asdfasdf", "ytuaq", "eyhefabafdha"};
        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {
            msg.writeMsg(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        msg.writeMsg("Finished");

    }


}