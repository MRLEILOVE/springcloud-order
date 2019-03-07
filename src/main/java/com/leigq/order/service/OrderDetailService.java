package com.leigq.order.service;

import com.leigq.order.domain.entity.OrderDetail;
import com.leigq.order.domain.mapper.OrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单详情
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:45 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Service
@Transactional
public class OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    /**
     * 添加订单详情
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 11:18
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     * @param orderDetail 订单详情实体
     * @return 新增订单详情Id
     */
    public Long saveOrderDetails(OrderDetail orderDetail) {
        return orderDetailMapper.insertSelective(orderDetail);
    }
}