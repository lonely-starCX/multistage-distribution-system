package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "customers")
public class Customers implements Serializable {
    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "telephone")
    private Integer telephone;

    /**
     * 收货地址
     */
    @Column(name = "address")
    private String address;

    @Column(name = "wechat_num")
    private String wechatNum;

    @Column(name = "point")
    private Integer point;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return telephone
     */
    public Integer getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return wechat_num
     */
    public String getWechatNum() {
        return wechatNum;
    }

    /**
     * @param wechatNum
     */
    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum == null ? null : wechatNum.trim();
    }

    /**
     * @return point
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }
}