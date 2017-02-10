package com.nineinfosys.andriod.oragami.Flower;

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

public class FlowerAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public FlowerAdapter(Context c) {
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
            R.drawable.bow,
    R.drawable.flo,
    R.drawable.flowe,
    R.drawable.flower,
    R.drawable.floww,
    R.drawable.flow,
    R.drawable.lotus,
    R.drawable.paper_all,
    R.drawable.paper_qul_flow,
    R.drawable.paper_petals,
    R.drawable.paper_pink,
    R.drawable.paper_y_flo,
    R.drawable.paper_yello,
    R.drawable.petal,
    R.drawable.star,
    R.drawable.paper_rose,
    R.drawable.zendu,
    R.drawable.paper_flower,
    R.drawable.paper_ro_flo,
    R.drawable.paper_sun
    };
}