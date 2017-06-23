package com.sda.threads;

import java.util.List;
import java.util.PrimitiveIterator;

/**
 * Created by Szymon on 2017-06-22.
 */
public class SumTask implements Runnable {

    private List<Integer> list;

    public SumTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long first = System.currentTimeMillis();
        //operacja
        System.out.println(System.currentTimeMillis() - first);
    }
}
