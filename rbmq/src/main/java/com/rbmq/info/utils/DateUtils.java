package com.rbmq.info.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工程名:rbmq
 * 包名:com.rbmq.utils
 * 文件名:DateUtils
 * description:
 *
 * @author lcwen
 * @version V1.0: DateUtils.java 2019/9/5 11:47
 **/
public class DateUtils {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    public static String getDateTime(){
        return  sdf.format(new Date());
    }

}
