package com.huminxi.springboot.mapper;

import com.huminxi.springboot.entity.User;

import java.util.List;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/04/07 19:44
 */
public interface UserMapper {
    List<User> select(User user);

    List<User> select(Integer id);
}
