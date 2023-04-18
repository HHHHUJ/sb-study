package com.mooc.sb2.controller.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            boolean append = true;
            fos = new FileOutputStream(new File("src/main/resources/file", "example.txt"), append);
//            fos.write("沉默的真相".getBytes());
            fos.write(120);
            fos.write('x');
            fos.write(0x12345678);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
