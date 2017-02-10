package com.geniusnine.andriod.oragami.Toys;

import com.geniusnine.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesToys {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesToys() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.acar);
        imageId1.add(R.drawable.care);
        imageId1.add(R.drawable.carr);
        imageId1.add(R.drawable.snapper);
        imageId1.add(R.drawable.drag);
        imageId1.add(R.drawable.opencar);
        imageId1.add(R.drawable.rocket);
        imageId1.add(R.drawable.star);
        imageId1.add(R.drawable.opencarrr);
        imageId1.add(R.drawable.carrrr);
        imageId1.add(R.drawable.toy);
        imageId1.add(R.drawable.vcc);
        imageId1.add(R.drawable.wreath);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}


