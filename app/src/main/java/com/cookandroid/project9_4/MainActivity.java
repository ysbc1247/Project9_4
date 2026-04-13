package com.cookandroid.project9_4;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MyGraphicView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        paintView = new MyGraphicView(this);
        setContentView(paintView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shape_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_add_line) {
            paintView.setCurrentShapeType(ShapeType.LINE);
            return true;
        }

        if (id == R.id.action_add_circle) {
            paintView.setCurrentShapeType(ShapeType.CIRCLE);
            return true;
        }

        if (id == R.id.action_add_rect) {
            paintView.setCurrentShapeType(ShapeType.RECT);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
