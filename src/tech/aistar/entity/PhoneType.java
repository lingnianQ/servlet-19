package tech.aistar.entity;

import java.io.Serializable;

/**
 * 本类用来演示: 用户实体类
 *
 * @author: Q
 * @date: 2021/10/25 5:00 上午
 */
public class PhoneType implements Serializable {
    private Integer id;
    private String phoneName;
    private String urls;
    private Float price;
    private String remark;
    private String phoneTypeName;

    public PhoneType(){

    }

    public PhoneType(Integer id, String phoneName, String urls, Float price, String remark, String phoneTypeName) {
        this.id = id;
        this.phoneName = phoneName;
        this.urls = urls;
        this.price = price;
        this.remark = remark;
        this.phoneTypeName = phoneTypeName;
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

    public String getPhoneTypeName() {
        return phoneTypeName;
    }

    public void setPhoneTypeName(String phoneTypeName) {
        this.phoneTypeName = phoneTypeName;
    }

    @Override
    public String toString() {
        return "PhoneType{" +
                "id=" + id +
                ", phoneName='" + phoneName + '\'' +
                ", urls='" + urls + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", phoneTypeName='" + phoneTypeName + '\'' +
                '}';
    }
}
