package com.mooc.sb2.controller.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IoTest {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/io.txt"));
        byte[] buffer = new byte[1024];
        int b;
        while((b = bis.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, b));
        }
        bis.close();
    }
}
