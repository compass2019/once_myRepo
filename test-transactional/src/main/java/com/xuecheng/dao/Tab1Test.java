package com.xuecheng.dao;

import com.xuecheng.domain.Tab1;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Tab1Test {

    public void update1(Tab1 tab1);

    public void update2(Tab1 tab1);

    public List<Tab1> selectByAll();
}