package com.example.myapp3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Kamil on 2015-12-22.
 */
public class Kwadraty extends View{

    public Kwadraty(Context context) {
        super(context);
    }

    public Kwadraty(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Kwadraty(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int szer = getMeasuredWidth();
        int wys = getMeasuredHeight();
        Paint p = new Paint();
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.RED);
        canvas.drawCircle(szer/2,wys/2,100,p);
        super.onDraw(canvas);
    }
}
