package com.concurtest;

import java.util.concurrent.Semaphore;

/**
 * Created by Vivek on 14/6/14.
 */
public class People extends Thread{
    private final Semaphore machine;


    public People(Semaphore machine,String name) {
        super(name);
        this.machine = machine;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName()+ "waiting to access ATM");
            machine.acquire();

            System.out.println(getName() + " NOW using the ATM machine");
            Thread.sleep(9000);

            /*System.out.println(getName()+ " taking access again to access ATM");
            machine.acquire();*/

            System.out.println(getName() + " going outside");
            machine.release();
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
