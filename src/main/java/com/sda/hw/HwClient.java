package com.sda.hw;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class HwClient {
    public static void main(String[] args) throws IOException {
        //laczy sie do servera
        //po podlaczeniu wysyla liczbe n
        //czeka na odpowiedz
        //po otrzymaniu wysyla ja w odwrotnej kolejnosci StringUtils.reverse

        Socket socket = new Socket("localhost", 1234);

        Scanner socketIn = new Scanner(socket.getInputStream());
        BufferedWriter socketOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give number:");

        int input = scanner.nextInt();

        socketOut.write(input + "\n");
        socketOut.flush();

        String message = socketIn.nextLine();

        System.out.println("Received message: " + message);

        String reversedMessage = StringUtils.reverse(message);
        System.out.println("Reversed message: " + reversedMessage);

        socket.close();

    }
}
