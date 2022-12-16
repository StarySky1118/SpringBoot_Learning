package com.zzy.intro.config;

import com.zzy.intro.pojo.Student;
import org.springframework.context.annotation.*;

@Configuration // 说明这是一个配置类
@ImportResource(value = "classpath:SpringConfig.xml") // 导入其他 xml 配置文件
@PropertySource(value = "classpath:jdbc.properties") // 导入 properties 配置文件
@ComponentScan(basePackages = "com.zzy.intro.pojo")
public class SpringConfig {
    @Bean("student") // 将方法返回的对象纳入 Spring 容器管理
    public Student getStudent() {
        return new Student("田所浩二", 24);
    }
}
