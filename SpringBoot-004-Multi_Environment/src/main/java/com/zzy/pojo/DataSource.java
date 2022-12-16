package com.zzy.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // 纳入Spring容器管理
@ConfigurationProperties("jdbc")
public class DataSource {
    private String username;
    private String password;

    public DataSource() {
    }

    public DataSource(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "DataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
