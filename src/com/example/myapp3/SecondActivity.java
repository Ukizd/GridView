package com.example.myapp3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Kamil on 2015-12-18.
 */
public class SecondActivity extends Activity{
    public int Pic[]={R.drawable.pic01, R.drawable.pic02,R.drawable.pic03,R.drawable.pic04,R.drawable.pic05,R.drawable.pic06,R.drawable.pic07,R.drawable.pic08,R.drawable.pic09,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.pic13,R.drawable.pic14,R.drawable.pic15};
    Button dalej,wstecz, koniec;
    ImageView image;
    Bitmap bMap;
    Bitmap bMapScaled;

    int licznik;
    int position;
    Intent i;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seconlayout);
         i = getIntent();
        position = i.getIntExtra("Parametr" , 0);

        dalej=(Button)findViewById(R.id.Dalej);
        wstecz=(Button)findViewById(R.id.Wstecz);
        koniec=(Button)findViewById(R.id.Koniec);

        image=(ImageView)findViewById(R.id.Image);

        bMap = BitmapFactory.decodeResource(getResources(), Pic[position]);
        bMapScaled = Bitmap.createScaledBitmap(bMap, 800, 550, true);
        image.setImageBitmap(bMapScaled);
        licznik++;


        dalej.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                position++;
                bMap = BitmapFactory.decodeResource(getResources(), Pic[position]);
                bMapScaled = Bitmap.createScaledBitmap(bMap, 800, 550, true);
                //image.setScaleType(ImageView.ScaleType.CENTER_CROP);
                image.setImageBitmap(bMapScaled);
                licznik++;
                if(position==14)
                    position=0;

            }
        });
        wstecz.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub
                position--;
                bMap = BitmapFactory.decodeResource(getResources(), Pic[position]);
                bMapScaled = Bitmap.createScaledBitmap(bMap, 800, 550, true);
                //image.setScaleType(ImageView.ScaleType.CENTER_CROP);
                image.setImageBitmap(bMapScaled);
                licznik++;
                if(position==0)
                    position=14;

            }
        });
        koniec.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                i.putExtra("Parametr",licznik);

        setResult(RESULT_OK,i);
                finish();
            }
        });




    }
}