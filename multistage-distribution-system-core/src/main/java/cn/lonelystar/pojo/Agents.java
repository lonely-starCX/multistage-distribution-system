package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "agents")
public class Agents implements Serializable {
    @Id
    @Column(name = "agent_id")
    private String agentId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private Integer telephone;

    @Column(name = "wechat_num")
    private String wechatNum;

    /**
     * 收货地址
     */
    @Column(name = "address")
    private String address;

    @Column(name = "storage_id")
    private String storageId;

    @Column(name = "auth_code")
    private String authCode;

    /**
     * 代理商状态0-未授权,1-已授权,2-已封号
     */
    @Column(name = "status")
    private Integer status;

    private static final long serialVersionUID = 1L;

    /**
     * @return agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
     * @return storage_id
     */
    public String getStorageId() {
        return storageId;
    }

    /**
     * @param storageId
     */
    public void setStorageId(String storageId) {
        this.storageId = storageId == null ? null : storageId.trim();
    }

    /**
     * @return auth_code
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * @param authCode
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    /**
     * 获取代理商状态0-未授权,1-已授权,2-已封号
     *
     * @return status - 代理商状态0-未授权,1-已授权,2-已封号
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置代理商状态0-未授权,1-已授权,2-已封号
     *
     * @param status 代理商状态0-未授权,1-已授权,2-已封号
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}