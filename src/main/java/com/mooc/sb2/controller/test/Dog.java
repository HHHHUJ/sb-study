package com.mooc.sb2.controller.test;

import java.util.*;

public class Dog {
    int i;
//    public Dog() {
//    }
    public void Dog() {
        i += 7;
        System.out.println(i);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("123");
        System.out.println(set);
        ArrayList<String> aList = new ArrayList<>();
        aList.add("A");
        aList.add("B");
        aList.add("C");
        int index = aList.indexOf("B");
        System.out.println(index);
        int lastIndex = aList.lastIndexOf("A");
        System.out.println(lastIndex);

        LinkedList<String> list = new LinkedList<>();
        list.add("头部");
        list.add("双向");
        list.add("链表");
        list.add("尾部");
        list.addFirst("新增");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("身高", 177);
        map.put("体重", 142);
        for(String key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "对应的值是：" + value);
        }
    }
}
