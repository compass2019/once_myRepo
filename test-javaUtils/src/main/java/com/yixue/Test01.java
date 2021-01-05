package com.yixue;

import com.yixue.domain.Teacher;

public class Test01 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("lisi");
        teacher.setAge(30);


        Teacher teacher1 = new Teacher();
        teacher1.setName("lisi");
        teacher1.setAge(30);


        System.out.println(teacher.equals(teacher1));
    }
}
