package com.mycomp.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

    @Override
    public void delete() {
        System.out.println("UserDao从数据库删除记录...");
    }
}
