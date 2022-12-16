package com.zzy.intro.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("dataSource") // 纳入容器管理，配置类还需要组件扫描
public class DataSource {
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
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
