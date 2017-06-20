package com.sda.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Szymon on 2017-06-19.
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        while (true) {
            Thread.sleep(100);
            if (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }
}
