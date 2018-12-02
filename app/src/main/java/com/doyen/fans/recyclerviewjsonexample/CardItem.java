package com.doyen.fans.recyclerviewjsonexample;

public class CardItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public CardItem(String imageUrl, String creator, int likes){
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }
}
