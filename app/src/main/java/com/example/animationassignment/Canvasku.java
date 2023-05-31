package com.example.animationassignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class Canvasku extends View {

    Paint paint;
    public boolean check = false;
    public boolean left = false;
    public boolean right = false;
    public boolean up = false;
    public boolean down = false;
    float x, y;


    public Canvasku(Context context) {
        super(context);
    }

    public Canvasku(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (check == false) {

            canvas.drawCircle(this.getWidth()/2, this.getHeight()/2, 100, paint);
            x = this.getWidth()/2; //current x and y
            y = this.getHeight()/2;
        } else if (left) {
            x = x - 20;
            canvas.drawCircle(x,y,100,paint);
        } else if (right) {
            x = x + 20;
            canvas.drawCircle(x,y,100,paint);
        } else if (up) {
            y = y - 20;
            canvas.drawCircle(x,y,100,paint);
        } else if (down) {
            y = y + 20;
            canvas.drawCircle(x,y,100,paint);
        }
    }
}
