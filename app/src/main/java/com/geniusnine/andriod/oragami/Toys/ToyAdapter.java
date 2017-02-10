package com.geniusnine.andriod.oragami.Toys;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.geniusnine.andriod.oragami.R;

/**
 * Created by Supriya on 10-02-2017.
 */

public class ToyAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ToyAdapter(Context c) {
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
            R.drawable.acar,
    R.drawable.care,
    R.drawable.carr,
    R.drawable.snapper,
    R.drawable.drag,
    R.drawable.opencar,
    R.drawable.rocket,
    R.drawable.star,
    R.drawable.opencarrr,
    R.drawable.carrrr,
    R.drawable.toy,
    R.drawable.vcc,
    R.drawable.wreath
    };
}