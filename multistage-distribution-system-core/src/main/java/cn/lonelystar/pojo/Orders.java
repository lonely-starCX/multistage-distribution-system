package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "orders")
public class Orders implements Serializable {
    /**
     * 订单生成时间+UUID
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "buy_num")
    private Integer buyNum;

    /**
     * 订单备注
     */
    @Column(name = "description")
    private String description;

    /**
     * 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    @Column(name = "current_status")
    private Integer currentStatus;

    /**
     * 发货代理id或总部管理员id
     */
    @Column(name = "from_id")
    private String fromId;

    @Column(name = "to_id")
    private String toId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单生成时间+UUID
     *
     * @return order_id - 订单生成时间+UUID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单生成时间+UUID
     *
     * @param orderId 订单生成时间+UUID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * @return product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * @return buy_num
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * @param buyNum
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    /**
     * 获取订单备注
     *
     * @return description - 订单备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置订单备注
     *
     * @param description 订单备注
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     *
     * @return current_status - 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    public Integer getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 设置0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     *
     * @param currentStatus 0-未支付订单、1-已支付待出库订单、2-已出库待发货订单、3-已发货订单、
            4-已收货订单、5-已撤销订单
     */
    public void setCurrentStatus(Integer currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * 获取发货代理id或总部管理员id
     *
     * @return from_id - 发货代理id或总部管理员id
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * 设置发货代理id或总部管理员id
     *
     * @param fromId 发货代理id或总部管理员id
     */
    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    /**
     * @return to_id
     */
    public String getToId() {
        return toId;
    }

    /**
     * @param toId
     */
    public void setToId(String toId) {
        this.toId = toId == null ? null : toId.trim();
    }
}