package com.huminxi.springboot.service;

import com.huminxi.springboot.entity.User;
import com.huminxi.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/04/07 20:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        if (id != null) {
            user.setId(id);
        }
        user.setName("hufei");
        List<User> select = userMapper.select(user);
        return select.get(0);
    }
}
