package com.mooc.sb2.controller.file;

import java.io.*;

public class BufferFile {
    public static void main(String[] args) throws FileNotFoundException {
        // 记录开始时间
        long start = System.currentTimeMillis();
// 创建流对象
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/file/test.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/resources/file/copy2.jpg"));){
            // 读写数据
            int len;
            byte[] bytes = new byte[18*1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
// 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:"+(end - start)+" 毫秒");
    }
}
