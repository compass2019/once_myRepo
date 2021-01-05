package com.yixue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DateTransform {

    /**
     * 日期转时间字符串
     * Date transform String
     */
    @Test
    public void testDateTransf(){
        Date date = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = dateFormat.format(date);
//        System.out.println(format);//2020-12-22 09:05:40

//        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
//        String format1 = dateFormat1.format(date);
//        System.out.println(format1);//09:09:25

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

    }

}
