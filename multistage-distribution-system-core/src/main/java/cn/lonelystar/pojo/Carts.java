package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "carts")
public class Carts implements Serializable {
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Id
    @Column(name = "customer_id")
    private String customerId;

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

    /**
     * @return customer_id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }
}