package pl.sda.programowanieI;

class Runner implements Runnable {

    long silnia(long n) {
        if (n < 2) {
            return 1;
        }
        return silnia(n - 1) * n;
    }

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
            silnia(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Main {

    public static void main(String[] args) {
       // Thread thread = new Thread(new Runner());
       // Thread thread1 = new Thread(new Runner());
       // thread.start();
       // thread1.start();
//        RunnerExample runnerExample = new RunnerExample();
//        RunnerExample runnerExample2 = new RunnerExample();
//        runnerExample.start();
//        runnerExample2.start();

//        Thread thread = new Thread(new Runnable() { //klasa anonimowa
//            @Override
//            public void run() {
//                for (int i = 0; i < 50; i++) {
//                    System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() { //klasa anonimowa
//            @Override
//            public void run() {
//                for (int i = 0; i < 50; i++) {
//                    System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        thread.start();
//        thread2.start();


        ThreadZadanie threadZadanie = new ThreadZadanie();
        ThreadZadanie threadZadanie1 = new ThreadZadanie();
        threadZadanie.start();
        threadZadanie1.start();


    }
}
