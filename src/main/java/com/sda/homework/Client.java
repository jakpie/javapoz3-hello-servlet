package com.sda.homework;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        Scanner scanner = new Scanner(socket.getInputStream());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner scannerFromUser = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Insert number: ");
            String number = scannerFromUser.nextLine();
            writer.write(number + "\n");
            writer.flush();
        }

        String result = scanner.nextLine();
        System.out.println("Result is: " + result);

        socket.close();
        //* dodac obsluge zajetego polaczenia
        //* pierwszy request zawiera informacje o ilosci wysylanych elementow
    }
}
