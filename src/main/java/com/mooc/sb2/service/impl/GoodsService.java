package com.mooc.sb2.service.impl;

import com.mooc.sb2.bean.GoodsDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    public List<GoodsDo> getGoodsList() {
        List<GoodsDo> list = new ArrayList<GoodsDo>();
        GoodsDo goods = new GoodsDo();
        goods.setName("苹果");
        goods.setPic("apple.jpg");
        goods.setPrice("3.5");
        list.add(goods);
        return list;
    }
}
