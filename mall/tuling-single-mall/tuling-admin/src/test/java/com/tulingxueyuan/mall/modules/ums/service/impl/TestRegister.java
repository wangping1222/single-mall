package com.tulingxueyuan.mall.modules.ums.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import org.junit.jupiter.api.Test;

public class TestRegister {
    @Test
   public void register(){
        String encodePassword = BCrypt.hashpw("123456");
        System.out.println(encodePassword);
    }
}
