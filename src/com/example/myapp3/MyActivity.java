package com.example.myapp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import static android.R.color.holo_blue_bright;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    int licznik;
    int kod = 15;
    int pozycja=0;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        licznik=0;

        GridView mGrid = (GridView) findViewById(R.id.gridView1);

        mGrid.setAdapter(new ImageAdapter(this));

        mGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position,
                                    long id) {

                Intent i = new Intent(MyActivity.this, SecondActivity.class);
                pozycja=position;
                i.putExtra("Parametr", pozycja);
                startActivityForResult(i, kod);
                //Toast.makeText(MyActivity.this, " " + licznik, Toast.LENGTH_SHORT).show();
            }


        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            licznik=data.getIntExtra("Parametr",0);
            Toast.makeText(MyActivity.this, "Wyświetlono " + licznik+ " zdjęć", Toast.LENGTH_LONG).show();
            licznik=0;

        }
    }
}


