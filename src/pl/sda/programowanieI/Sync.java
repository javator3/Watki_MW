package pl.sda.programowanieI;

class Sender {
    public void send(String msg) {
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + msg + " Sent");
    }
}

class ThreadSend extends Thread {
    private String msg;
    private Thread thread;
    private Sender sender;

    public ThreadSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) { // synchronizowanie wątków
            sender.send(msg);
        }
    }
}

public class Sync {

    public static void main(String[] args) {

        Sender sender = new Sender();
        ThreadSend threadSend = new ThreadSend("dzień dobry", sender);
        ThreadSend threadSend1 = new ThreadSend("do widzenia", sender);
        threadSend.start();
        threadSend1.start();

        try {
            threadSend.join();  // łączenie wątków
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            threadSend1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Koniec"); // koniec wyświetlił się na końcu, ponieważ wątki zostały połączone


    }
}
