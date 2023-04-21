package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.GoodsDo;

public interface GoodsMapper {

    public GoodsDo selectForUpdate(Long id);

    public int update(GoodsDo Goods);
}
