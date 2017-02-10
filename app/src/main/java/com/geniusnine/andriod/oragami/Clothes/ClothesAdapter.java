package com.geniusnine.andriod.oragami.Clothes;

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

public class ClothesAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ClothesAdapter(Context c) {
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
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 15, 15, 5);
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
            R.drawable.bowwww,
    R.drawable.cocktail,
    R.drawable.foldshirt,
    R.drawable.onepiece,
    R.drawable.onepiesce,
    R.drawable.shirt,
    R.drawable.trouser,
    R.drawable.tiee,
    R.drawable.skirt,
    R.drawable.shirty,
    R.drawable.tie,
    R.drawable.foldshirt,
    R.drawable.shir,
    R.drawable.tieee
    };
}