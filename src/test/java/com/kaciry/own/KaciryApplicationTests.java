package com.kaciry.own;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaciry.own.dao.UserBaseMapper;
import com.kaciry.own.model.User;
import com.kaciry.own.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KaciryApplicationTests {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        User user = new User();
        user.setUserName("Kaciry");
        queryWrapper.eq("USER_NAME",user.getUserName());
        User one = userBaseMapper.selectOne(queryWrapper);
        System.out.println(one);
        List<User> users = userBaseMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void test(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        User user = new User();
        user.setUserName("Kaciry");
        queryWrapper.eq("USER_NAME",user.getUserName());
        User one = userService.getOne(queryWrapper);
        System.out.println(one);
    }

}
