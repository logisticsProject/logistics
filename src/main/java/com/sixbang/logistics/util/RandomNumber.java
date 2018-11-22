package com.sixbang.logistics.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 随机产生订单编号
 */
public class RandomNumber {

    public static int number = 1;

    private static Random random = new Random();

    /**
     * 生成订单号
     * @return 返回 Sting 类型的流水账号
     */
    public static String getLiuShuiId() {
        String str = null;
        int num = random.nextInt(100000) + 10000;
        int i = random.nextInt(25) + 67+number;
        char ch = (char) i;
        str = ch + "-" + num + "";
        number++;
        return str;
    }

    /**
     * 司机编号
     * @return
     */
    public static String getDriverid(){
        String str = null;
        String nowDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int num = random.nextInt(10);
        str = "S-"+nowDate+num;
        return str;
    }

    /**
     * 收发货人编号
     * @return
     */
    public static String getReceiver(){
        String str = null;
        String nowDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int num = random.nextInt(10);
        str = "M-"+num;
        return str;
    }

    /**
     * 职员编号
     * @return
     */
    public static String getStadd(){
        String str = null;
        String nowDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int num = random.nextInt(10);
        str = "Z-"+nowDate+num;
        return str;
    }

    /**
     * 合同编号
     * @return
     */
    public static String getContractId(){
        String str = null;
        String nowDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int num = random.nextInt(10);
        str = "H-"+nowDate+num;
        return str;
    }



}
