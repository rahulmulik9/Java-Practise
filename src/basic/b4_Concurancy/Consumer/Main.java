package basic.b4_Concurancy.Consumer;

import java.util.Random;


/*For following system still hange while using synchronise method
 * Application behave different each time */
/*
class MessageRepo {
    private String message;
    private boolean hasSeenMessage = false;

    public synchronized String read() {
        while (!hasSeenMessage) {

        }
        hasSeenMessage = false;
        return message;
    }

    public synchronized void write(String message) {
        while (hasSeenMessage) {

        }
        hasSeenMessage = true;
        this.message = message;
    }
}

class MessageWriter implements Runnable {
    private MessageRepo outGoingMsg;
    private final String text = "Hi Rahul, How are you?" +
            "Its been a long time." +
            "Great to see you back";

    public MessageWriter(MessageRepo outGoingMsg) {
        this.outGoingMsg = outGoingMsg;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            outGoingMsg.write(lines[i]);
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        outGoingMsg.write("Fininshed");
    }
}

class MessageReader implements Runnable {
    private MessageRepo incomingGoingMsg;

    public MessageReader(MessageRepo incomingGoingMsg) {
        this.incomingGoingMsg = incomingGoingMsg;
    }

    @Override
    public void run() {
        Random random = new Random();

        String lastestMessge = "";

        do {
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lastestMessge = incomingGoingMsg.read();
            System.out.println(lastestMessge);
        } while (!lastestMessge.equals("Finished"));
    }
}


public class Main {
    public static void main(String[] args) {

        MessageRepo messageRepo = new MessageRepo();
        Thread reader = new Thread(new MessageReader(messageRepo));
        Thread writer = new Thread(new MessageWriter(messageRepo));

        writer.start();
        reader.start();
    }
}
*/


/*Thread reader is our consumer
 * Thread writer is our Producer
 * Initially flag is false so that value is not going to change
 * So if thread reader get lock then write cant access it and vice versa
 * This is deadlock situation, thread is waiting infinite time to complete another thread task*/

