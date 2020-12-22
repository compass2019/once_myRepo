package com.xuecheng.dao;

import com.xuecheng.domain.Tab1;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Tab1Test {

    public void update1(Tab1 tab1);

    public void update2(Tab1 tab1);

    public List<Tab1> selectByAll(@Param("id") int id);
    public List<Tab1> selectByAll();
}