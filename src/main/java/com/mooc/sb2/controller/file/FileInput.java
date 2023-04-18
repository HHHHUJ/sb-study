package com.mooc.sb2.controller.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/file/example.txt");
        FileOutputStream fos = new FileOutputStream("src/main/resources/file/copy_example.txt");
        byte [] buffer = new byte[1024];
        int count;
        while((count = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, count);
        }
        fis.close();
        fos.close();
    }
}
