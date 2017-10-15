package com.sania.demoanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by sania on 12/09/2017.
 */

public class CustomView extends View {

    public CustomView(Context context){
        super(context);
    }
    public CustomView(Context context, AttributeSet a){
        super(context,a);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
// set the color randomly
        int whichColor = (int) (Math.random() * 4);
        if (whichColor == 0)
            paint.setColor(Color.RED);
        else if (whichColor == 1)
            paint.setColor(Color.GREEN);
        else if (whichColor == 2)
            paint.setColor(Color.BLUE);
        else
            paint.setColor(Color.YELLOW);
// draw Rectangle with corners at (40, 20) and (90, 80)

        //drawRect(leftwidth,leftheight,rightwidth,rightheight)
        canvas.drawRect(0, 0, canvas.getWidth()/2,canvas.getHeight()/4, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {

// get the coordinates
            float x = event.getX();
            float y = event.getY();
// see if they clicked the box
            if (x >= 0 && x <= getWidth() && y >= 0 && y <= getHeight()/2) {
// redraw the View... this calls onDraw again!
                invalidate();
            }
        }
// indicates that the event was handled
        return true;
    }
}
