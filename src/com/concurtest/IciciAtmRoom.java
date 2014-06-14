package com.concurtest;

import java.util.concurrent.Semaphore;

/**
 * Created by Vivek on 14/6/14.
 */
public class IciciAtmRoom {
    public static void main(String[] args) {
        Semaphore machine = new Semaphore(1);
        People p1 = new People(machine,"pradeep");
        People p2 = new People(machine, "sandeep");
        People p3 = new People(machine, "kalia");
        People p4 = new People(machine, "raju");
    }
}
