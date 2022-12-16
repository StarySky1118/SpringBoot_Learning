package com.zzy.mapper;

import com.zzy.pojo.Account;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountMapperTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testInsert() {
        int count = accountMapper.insert(new Account(null, "005", BigDecimal.valueOf(1000)));
        System.out.println(count);
    }
}
