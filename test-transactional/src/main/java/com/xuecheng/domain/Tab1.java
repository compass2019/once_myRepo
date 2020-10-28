package com.xuecheng.domain;



public class Tab1 {

    private Integer id;
    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tab1{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
