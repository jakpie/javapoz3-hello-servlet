package com.sda.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Szymon on 2017-06-26.
 */
public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);

        boolean flag = true;

        ChatUsersStorage storage = new ChatUsersStorage();
        while (flag) {
            Socket socket = serverSocket.accept();
            Runnable chatTask = new ChatServerTask(socket, storage);
            Thread thread = new Thread(chatTask);
            thread.start();
        }
        serverSocket.close();
    }
}
