package com.easyaccount.controller;

import com.easyaccount.bean.Account;
import com.easyaccount.dao.AccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/easyaccount")
public class EAController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    AccountDao accountDao;

    @RequestMapping("/add")
    public String main(Account account){
        accountDao.insert(account);
        logger.info("inset {}",account);
        return "easyaccount/main";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Account> accounts = accountDao.selectAll();
        model.addAttribute("accounts",accounts);
        logger.info("select {}",accounts);
        return "easyaccount/main";
    }

}
