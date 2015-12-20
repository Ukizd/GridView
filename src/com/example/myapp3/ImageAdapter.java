package com.example.myapp3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Kamil on 2015-12-16.
 */
public class ImageAdapter extends BaseAdapter
{
    private Context mContext;
    private int Pic[]={R.drawable.pic01, R.drawable.pic02,R.drawable.pic03,R.drawable.pic04,R.drawable.pic05,R.drawable.pic06,R.drawable.pic07,R.drawable.pic08,R.drawable.pic09,R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.pic13,R.drawable.pic14,R.drawable.pic15};
    public ImageAdapter(Context c){
        mContext = c;
    }
    @Override
    public int getCount() {
        return Pic.length;
    }

    @Override
    public Object getItem(int position) {
        return null ;
    }

    @Override
    public long getItemId(int position) {
        return 0L;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView foto;
        if(view==null){
            foto = new ImageView(mContext);
            foto.setLayoutParams(new GridView.LayoutParams(200,225));
            foto.setScaleType(ImageView.ScaleType.CENTER_CROP);
            foto.setPadding(50,50,50,50);
        }
        else
            foto = (ImageView) view;
        foto.setImageResource(Pic[position]);


        return foto;
    }
}
