package tech.aistar.entity;

import java.io.Serializable;

/**
 * 本类用来演示: 用户实体类
 *
 * @author: Q
 * @date: 2021/10/25 5:00 上午
 */

public class Phone implements Serializable {
    private Integer id;

    private String phoneName;

    private String urls;

    private Float price;

    private String remark;
    private Integer phone_type_id;

    public Phone(){

    }

    public Phone(Integer id, String phoneName, String urls, Float price, String remark, Integer phone_type_id) {
        this.id = id;
        this.phoneName = phoneName;
        this.urls = urls;
        this.price = price;
        this.remark = remark;
        this.phone_type_id = phone_type_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPhone_type_id() {
        return phone_type_id;
    }

    public void setPhone_type_id(Integer phone_type_id) {
        this.phone_type_id = phone_type_id;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", urls='" + urls + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", phone_type_id=" + phone_type_id +
                '}';
    }
}
