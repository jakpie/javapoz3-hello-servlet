package com.sda.todo;

/**
 * Created by Szymon on 2017-06-09.
 */
public interface TodoChainElement {
    boolean isMyResponsibility(String path);

    String action();
}
