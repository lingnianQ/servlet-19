package tech.aistar.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 本类用来演示: 用户实体类
 *
 * @author: Q
 * @date: 2021/10/23 10:00 上午
 */
public class User implements Serializable {//可序列化接口
    private Integer id;

    private String username;

    private String password;

    private Date birthday;

    private Integer status;

    public User() {
    }

    public User(Integer id, String username, String password, Date birthday, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
