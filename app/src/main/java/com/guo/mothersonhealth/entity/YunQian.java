package com.guo.mothersonhealth.entity;

/**
 * Created by GN on 2017/5/23.
 */

public class YunQian {
    private String name;
    private int imageId;

    public YunQian(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
