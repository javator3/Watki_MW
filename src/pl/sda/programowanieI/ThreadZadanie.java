package pl.sda.programowanieI;

import java.util.Random;

public class ThreadZadanie extends Thread{

   @Override
    public void run() {
       int n;
       Random random = new Random();
       n = random.nextInt(100);

       System.out.println("Wynik: " + n*2 + " thread: " + Thread.currentThread().getName());

    }
}
