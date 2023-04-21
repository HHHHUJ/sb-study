package com.mooc.sb2.service.impl;

import com.mooc.sb2.bean.GoodsDo;
import com.mooc.sb2.bean.OrderDo;
import com.mooc.sb2.mapper.GoodsMapper;
import com.mooc.sb2.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 下单
     *
     * @param goodsId 购买商品id
     * @param count   购买商品数量
     * @return 生成订单数
     */
    @Transactional // 实现事务
    public int createOrder(Long goodsId, Long count) {
        // 锁定商品库存
        GoodsDo goods = goodsMapper.selectForUpdate(goodsId);
        // 扣减库存
        Long newNum = goods.getNum() - count;
        goods.setNum(newNum);
        goodsMapper.update(goods);
        // 生成订单
        OrderDo order = new OrderDo();
        order.setGoodsId(goodsId);
        order.setCount(count);
        int affectRows = orderMapper.insert(order);
        return affectRows;
    }
}
