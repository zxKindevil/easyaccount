package com.easyaccount.dao;

import com.easyaccount.bean.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ↓↓↓↓↓↓↓↓↓↓描述↓↓↓↓↓↓↓↓↓↓
 *
 * @author zhangxin.zhang created on 15-11-29.
 */
@Repository
public interface AccountDao {
    int insert(Account account);
    List<Account> selectAll();
}
