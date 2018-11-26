package cn.lonelystar.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "products")
public class Products implements Serializable {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "name")
    private String name;

    /**
     * 商品图片引用地址
     */
    @Column(name = "image_href")
    private String imageHref;

    @Column(name = "description")
    private String description;

    private static final long serialVersionUID = 1L;

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
     * 获取商品图片引用地址
     *
     * @return image_href - 商品图片引用地址
     */
    public String getImageHref() {
        return imageHref;
    }

    /**
     * 设置商品图片引用地址
     *
     * @param imageHref 商品图片引用地址
     */
    public void setImageHref(String imageHref) {
        this.imageHref = imageHref == null ? null : imageHref.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}