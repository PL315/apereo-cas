package com.pwd;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

/**

/**
 *@Author PL
 *@Date 2018/11/15 9:01
 *@Description TODO 自定义shiro工具类
 **/
public class ShiroUtils {

    /**
     * 加密方法
     * @return
     */
    public static String encrypt(String pwd){
        String hashAlgorithmName = "MD5";
        Object salt = new Md5Hash("123");
        System.out.println(salt);
        // 202cb962ac59075b964b07152d234b70
        int hashIterations = 1024;
        Object result = new SimpleHash(hashAlgorithmName, pwd, salt, hashIterations);
        return result.toString();
    }

    public static void main(String[] args) {
        ShiroUtils.encrypt("123456");
    }
}
