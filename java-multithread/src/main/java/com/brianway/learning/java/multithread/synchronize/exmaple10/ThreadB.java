package com.brianway.learning.java.multithread.synchronize.exmaple10;

/**
 * Created by brian on 2016/4/13.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
