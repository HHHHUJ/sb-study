package com.mooc.sb2.controller.test;

public class StreamTest {
    public static void main(String[] args) {
//        String password = "password";
//        Optional<String> opt = Optional.ofNullable(password);
//
//        Predicate<String> len6 = pwd -> pwd.length() > 6;
//        Predicate<String> len10 = pwd -> pwd.length() < 10;
//        Predicate<String> eq = pwd -> pwd.equals("888");
//
//        boolean result = opt.map(String::toLowerCase).filter(len6.and(len10 ).and(eq)).isPresent();
//        System.out.println(result);
//        new Thread(() -> System.out.println("fff")).start();


        // 1）基本类型和包装类型
        int a = 100;
        Integer b = 100;
        System.out.println(a == b);

// 2）两个包装类型
        Integer c = 129;
        Integer d = 129;
        System.out.println(c == d);

// 3）
        c = 200;
        d = 200;
        System.out.println(c == d);

    }
}
