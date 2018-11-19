package com.sixbang.logistics.util;

import java.util.Random;

/**
 * 随机产生订单编号
 */
public class RandomNumber {

    private static Random random = new Random();

    /**
     * 流水账单的信息
     *
     * @return 返回流水账号
     */
    public static String getLiuShuiId() {
        String str = null;
        int num = random.nextInt(100000) + 10000;
        int i = random.nextInt(25) + 67;
        char ch = (char) i;
        str = ch + "-" + num + "";
        return str;
    }

}
