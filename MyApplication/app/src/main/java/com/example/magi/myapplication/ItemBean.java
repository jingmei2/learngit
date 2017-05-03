package com.example.magi.myapplication;

/**
 * Created by magi on 2017/4/22.
 */

public class ItemBean {
    public int ItemImageResId;
    public String title;
    public String content;



    //构造方法 创建初始化对象
    public ItemBean(int itemImageResId, String title, String content) {
        ItemImageResId = itemImageResId;
        this.title = title;
        this.content = content;
    }


    public int getItemImageResId() {
        return ItemImageResId;
    }

    public void setItemImageResId(int itemImageResId) {
        ItemImageResId = itemImageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
