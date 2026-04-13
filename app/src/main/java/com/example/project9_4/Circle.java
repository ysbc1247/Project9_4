package com.example.project9_4;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Shape {
    public Circle(float startX, float startY, float endX, float endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        float radius = (float) Math.hypot(endX - startX, endY - startY);
        canvas.drawCircle(startX, startY, radius, paint);
    }
}
