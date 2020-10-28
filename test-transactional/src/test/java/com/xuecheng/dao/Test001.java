package com.xuecheng.dao;

import com.xuecheng.domain.Tab1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class Test001 {
    @Autowired
    Tab1Test tab1Test;

    @Test
//    @Transactional
    public void test(){
//        tab1Test.update01Tab1(66);
//        List<Tab1> tab1s = tab1Test.selectByAll();
//        Tab1 tab1 = new Tab1();
//        tab1.setId(1);
//        tab1.setSize(11);
//
//        Tab1 tab2= new Tab1();
//        tab2.setId(2);
//        tab2.setSize(22);
//
//        tab1Test.update1(tab1);
//        tab1Test.update2(tab2);
        List<Tab1> tab1s = tab1Test.selectByAll();
        System.out.println(tab1s);
    }
}