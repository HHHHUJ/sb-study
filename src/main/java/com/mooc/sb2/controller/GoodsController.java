package com.mooc.sb2.controller;

import com.mooc.sb2.service.impl.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goods")
    public String goods(Model model) {
        model.addAttribute("goodsList", goodsService.getGoodsList());
        return "goods";
    }
}
