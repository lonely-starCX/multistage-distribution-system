package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "storages")
public class Storages implements Serializable {
    @Id
    @Column(name = "storage_id")
    private String storageId;

    @Column(name = "product_id")
    private String productId;

    /**
     * 商品库存数量
     */
    @Column(name = "num")
    private Integer num;

    private static final long serialVersionUID = 1L;

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
     * 获取商品库存数量
     *
     * @return num - 商品库存数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置商品库存数量
     *
     * @param num 商品库存数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }
}