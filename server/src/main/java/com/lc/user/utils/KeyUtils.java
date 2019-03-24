package com.lc.user.utils;

import java.util.Random;

/**
 * @author lc
 * @date 2019/3/17
 */
public class KeyUtils {


    /**
     * 生成唯一的主键
     * 格式： 时间+随机数
     */
    public static synchronized  String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;

        return System.currentTimeMillis()+String.valueOf(number);
    }
}
