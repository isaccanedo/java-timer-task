package br.com.isaccanedo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Isac Canedo
 */

class MyTimerTask extends TimerTask {
    String name;

    public MyTimerTask(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Executando tarefa: " + name);
    }
}

class TimerDemo {

    public static void main(String[] args) {

        Timer t = new Timer();
        t.schedule(new MyTimerTask("um"), new Date(), 500);
        t.schedule(new MyTimerTask("dois"), 1000, 1000);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo esgotado!");
        t.cancel();
    }

}

