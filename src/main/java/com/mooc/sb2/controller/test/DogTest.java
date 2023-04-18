package com.mooc.sb2.controller.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        try (Socket socket = new Socket("bbs.newsmth.net", 23);) {
            InputStream is = socket.getInputStream();
            Scanner scanner = new Scanner(is, "gbk");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
