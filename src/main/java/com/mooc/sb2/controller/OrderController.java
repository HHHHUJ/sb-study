package com.mooc.sb2.controller;

import com.mooc.sb2.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("order")
    public HashMap order(@RequestBody HashMap<String, Long> map) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        int result = this.orderService.createOrder(map.get("id"), map.get("count"));
        objectObjectHashMap.put("success", true);
        objectObjectHashMap.put("data", result);
        return objectObjectHashMap;
    }
}
