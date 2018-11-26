package cn.lonelystar.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "orders_procedure")
public class OrdersProcedure implements Serializable {
    /**
     * 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    @Id
    @Column(name = "order_status")
    private Integer orderStatus;

    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 记录订单生成时间,订单支付时间,订单出库时间,订单发货时间,订单收货时间,订单撤销时间
     */
    @Column(name = "status_time")
    private Date statusTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     *
     * @return order_status - 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     *
     * @param orderStatus 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取记录订单生成时间,订单支付时间,订单出库时间,订单发货时间,订单收货时间,订单撤销时间
     *
     * @return status_time - 记录订单生成时间,订单支付时间,订单出库时间,订单发货时间,订单收货时间,订单撤销时间
     */
    public Date getStatusTime() {
        return statusTime;
    }

    /**
     * 设置记录订单生成时间,订单支付时间,订单出库时间,订单发货时间,订单收货时间,订单撤销时间
     *
     * @param statusTime 记录订单生成时间,订单支付时间,订单出库时间,订单发货时间,订单收货时间,订单撤销时间
     */
    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }
}