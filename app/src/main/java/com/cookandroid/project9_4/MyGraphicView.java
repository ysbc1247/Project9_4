package com.cookandroid.project9_4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyGraphicView extends View {
    private final List<Shape> shapeList = new ArrayList<>();
    private final Paint drawPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private ShapeType currentShapeType = ShapeType.LINE;
    private float startX;
    private float startY;
    private float currentX;
    private float currentY;
    private boolean isDrawing;

    public MyGraphicView(Context context) {
        super(context);
        drawPaint.setColor(Color.BLUE);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeWidth(8f);
    }

    public void setCurrentShapeType(ShapeType shapeType) {
        this.currentShapeType = shapeType;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (Shape shape : shapeList) {
            shape.draw(canvas, drawPaint);
        }

        if (isDrawing) {
            Shape preview = createShape(startX, startY, currentX, currentY);
            if (preview != null) {
                preview.draw(canvas, drawPaint);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = event.getX();
                startY = event.getY();
                currentX = startX;
                currentY = startY;
                isDrawing = true;
                invalidate();
                return true;

            case MotionEvent.ACTION_MOVE:
                if (isDrawing) {
                    currentX = event.getX();
                    currentY = event.getY();
                    invalidate();
                }
                return true;

            case MotionEvent.ACTION_UP:
                if (isDrawing) {
                    currentX = event.getX();
                    currentY = event.getY();
                    Shape newShape = createShape(startX, startY, currentX, currentY);
                    if (newShape != null) {
                        shapeList.add(newShape);
                    }
                    isDrawing = false;
                    invalidate();
                }
                return true;

            default:
                return super.onTouchEvent(event);
        }
    }

    private Shape createShape(float sx, float sy, float ex, float ey) {
        switch (currentShapeType) {
            case LINE:
                return new Line(sx, sy, ex, ey);
            case CIRCLE:
                return new Circle(sx, sy, ex, ey);
            case RECT:
                return new Rect(sx, sy, ex, ey);
            default:
                return null;
        }
    }
}
