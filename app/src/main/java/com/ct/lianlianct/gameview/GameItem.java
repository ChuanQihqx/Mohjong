package com.ct.lianlianct.gameview;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class GameItem {

    Bitmap image;
    int id;
    Rect locationRect;
    boolean isHide;

    public boolean getIsHide() {
        return isHide;
    }

    public void setIsHide(boolean isHide) {
        this.isHide = isHide;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rect getLocationRect() {
        return locationRect;
    }

    public void setLocationRect(Rect locationRect) {
        this.locationRect = locationRect;
    }
}
