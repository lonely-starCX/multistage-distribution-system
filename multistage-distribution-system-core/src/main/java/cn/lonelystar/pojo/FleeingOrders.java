package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "fleeing_orders")
public class FleeingOrders implements Serializable {
    @Id
    @Column(name = "order_id")
    private String orderId;

    private static final long serialVersionUID = 1L;

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
}