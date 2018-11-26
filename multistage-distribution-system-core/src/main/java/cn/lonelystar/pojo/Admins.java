package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "admins")
public class Admins implements Serializable {
    @Id
    @Column(name = "admin_id")
    private String adminId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private Integer telephone;

    /**
     * 微信号
     */
    @Column(name = "wechat_num")
    private String wechatNum;

    @Column(name = "storage_id")
    private String storageId;

    private static final long serialVersionUID = 1L;

    /**
     * @return admin_id
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
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
     * 获取微信号
     *
     * @return wechat_num - 微信号
     */
    public String getWechatNum() {
        return wechatNum;
    }

    /**
     * 设置微信号
     *
     * @param wechatNum 微信号
     */
    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum == null ? null : wechatNum.trim();
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
}