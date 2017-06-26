package com.sda.threads;

/**
 * Created by Szymon on 2017-06-26.
 */
public class Test  {
    public static void main(String[] args) throws InterruptedException {
        TestCounter counter = new TestCounter();

        TestTask testTask = new TestTask(counter);
        TestTask testTask2 = new TestTask(counter);
        TestTask testTask3 = new TestTask(counter);

        Thread thread = new Thread(testTask);
        Thread thread2 = new Thread(testTask2);
        Thread thread3 = new Thread(testTask3);

        thread.start();
        thread2.start();
        thread3.start();

        Thread.sleep(500);

        counter.print();
    }
}
