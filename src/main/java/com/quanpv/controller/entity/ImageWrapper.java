package com.quanpv.controller.entity;

import com.quanpv.model.Category;

import java.util.List;

public class ImageWrapper {

    private List<String> list;

    public ImageWrapper() {

    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ImageWrapper{" +
                "list=" + list +
                '}';
    }
}
