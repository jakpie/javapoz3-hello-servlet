package com.sda.threads;

/**
 * Created by Szymon on 2017-06-26.
 */
public class TestCounter {

    private int counter = 0;

    public synchronized void increase() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }

    public void print() {
        System.out.println(counter);
    }
}
