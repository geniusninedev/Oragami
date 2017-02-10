package com.nineinfosys.andriod.oragami.Heart;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesHeart {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesHeart() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.alongheart);
        imageId1.add(R.drawable.bookheart);
        imageId1.add(R.drawable.flowheart);
        imageId1.add(R.drawable.flowher);
        imageId1.add(R.drawable.heart);
        imageId1.add(R.drawable.heartbox);
        imageId1.add(R.drawable.hearttt);
        imageId1.add(R.drawable.herbox);
        imageId1.add(R.drawable.herttt);
        imageId1.add(R.drawable.makeheart);
        imageId1.add(R.drawable.wingsheart);
        imageId1.add(R.drawable.greetheart);
      
    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}


