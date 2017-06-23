package com.sda.threads;

/**
 * Created by Szymon on 2017-06-22.
 */
public class MyTask implements Runnable {

    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
            System.out.println("Hello World from " + name + " thread.");
            System.out.println("Hello World from " + name + " thread.");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
