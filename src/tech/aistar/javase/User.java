package tech.aistar.javase;

/**
 * 本类用来演示:
 *
 * @author: Q
 * @date: 2021/10/16 3:04 下午
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    private double height;

    public User() {
    }

    public User(Integer id, String username, String password, double height) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}