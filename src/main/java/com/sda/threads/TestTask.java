package com.sda.threads;


public class TestTask implements Runnable {

    private TestCounter counter;

    public TestTask(TestCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increase();
        }
    }
}
