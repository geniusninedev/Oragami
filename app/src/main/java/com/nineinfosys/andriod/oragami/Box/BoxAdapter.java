package com.nineinfosys.andriod.oragami.Box;

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

public class BoxAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public BoxAdapter(Context c) {
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
          R.drawable.bagbox,
  R.drawable.box,
  R.drawable.boxx,
  R.drawable.boxxx,
  R.drawable.cupbox,
  R.drawable.fancybox,
  R.drawable.housebox,
  R.drawable.fancyyy,
  R.drawable.multibox,
  R.drawable.rabbitbox,
  R.drawable.shoebox,
  R.drawable.shopbox,
  R.drawable.tribox,
  R.drawable.triboxy,
  R.drawable.bitzz,
  R.drawable.boxy
    };
}