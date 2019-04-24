package com.wasisoft.fitsa_user_app.Model;

public class Nutritionist_items {

    private String mItemName;
    private int mItemImages;

    public Nutritionist_items(){}

    public Nutritionist_items(String mItemName, int mItemImages) {
        this.mItemName = mItemName;
        this.mItemImages = mItemImages;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public int getmItemImages() {
        return mItemImages;
    }

    public void setmItemImages(int mItemImages) {
        this.mItemImages = mItemImages;
    }

}
