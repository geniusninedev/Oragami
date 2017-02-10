package com.nineinfosys.andriod.oragami.Traditional.Animals;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.nineinfosys.andriod.oragami.R;

/**
 * Created by Supriya on 10-02-2017.
 */

public class AnimalAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public AnimalAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(15, 15, 15, 15);
            imageView.setAdjustViewBounds(true);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.adog,
   R.drawable.bearface,
   R.drawable.cat,
   R.drawable.cow,
   R.drawable.dog,
   R.drawable.dogy,
   R.drawable.elephant,
   R.drawable.fox,
   R.drawable.giraffe,
   R.drawable.koala,
   R.drawable.monkey,
   R.drawable.mouse,
   R.drawable.panda,
   R.drawable.pig,
   R.drawable.rabitt,
   R.drawable.rhino,
   R.drawable.sheepface,
   R.drawable.snake,
   R.drawable.tadpole,
   R.drawable.tyranosaure
    };
}