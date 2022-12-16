package com.zzy.mapper;

import com.zzy.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

public interface AccountMapper {
    int insert(Account account);
}
