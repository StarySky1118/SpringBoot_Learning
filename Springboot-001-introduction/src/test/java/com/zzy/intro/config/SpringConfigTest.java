package com.zzy.intro.config;

import com.zzy.intro.pojo.DataSource;
import com.zzy.intro.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigTest {
    @Test
    public void testNoXml() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testImport() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("student2", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDataSource() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);

    }
}
