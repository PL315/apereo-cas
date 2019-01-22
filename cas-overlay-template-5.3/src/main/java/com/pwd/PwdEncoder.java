package com.pwd;/**
 * @Description TODO
 * @Author PL
 * @Date 2019/1/3 10:21
 **/

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *@Author PL
 *@Date 2019/1/3 10:21
 *@Description TODO
 **/
public class PwdEncoder implements PasswordEncoder {

    private static final Logger log = LoggerFactory.getLogger(PwdEncoder.class);

    @Override
    public String encode(CharSequence charSequence) {

        return charSequence.toString() ;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        log.error("打印日志输出信息："+charSequence.toString()+"--"+s);
        log.error("加密后密码:"+ShiroUtils.encrypt(charSequence.toString()));
        log.error("数据库中密码："+s);
        log.error("验证之后的结果："+ShiroUtils.encrypt(charSequence.toString()).equals(s));
        return ShiroUtils.encrypt(charSequence.toString()).equals(s);
    }
}
