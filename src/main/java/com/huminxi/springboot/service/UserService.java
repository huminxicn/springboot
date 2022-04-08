package com.huminxi.springboot.service;

import com.huminxi.springboot.entity.User;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/04/07 20:40
 */
public interface UserService {
    User getUserById(Integer id);
}
