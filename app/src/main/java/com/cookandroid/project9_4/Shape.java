package com.cookandroid.project9_4;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    protected final float startX;
    protected final float startY;
    protected final float endX;
    protected final float endY;

    protected Shape(float startX, float startY, float endX, float endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public abstract void draw(Canvas canvas, Paint paint);
}
