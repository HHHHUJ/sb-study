package com.mooc.sb2.controller.test;

import ch.qos.logback.core.util.FileUtil;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file  = new File("src/main/resources/io111.txt");
//        // 判断文件或目录是否存在
//        if (file.exists()) {
//            System.out.println("文件或目录存在");
//        } else {
//            System.out.println("文件不存在");
//            file.createNewFile();
//        }
        FileUtils.forceDeleteOnExit(file);
    }
}
