package com.geniusnine.andriod.oragami.Butterfly;

import com.geniusnine.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesButterfly {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesButterfly() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.quillbutt);
        imageId1.add(R.drawable.quilll);
        imageId1.add(R.drawable.mastbutt);
        imageId1.add(R.drawable.finbutt);
        imageId1.add(R.drawable.fullbutt);
        imageId1.add(R.drawable.butterttt);
        imageId1.add(R.drawable.butterflyimg);
        imageId1.add(R.drawable.butterfly);
        imageId1.add(R.drawable.butterflay);
        imageId1.add(R.drawable.cabbage);
        imageId1.add(R.drawable.butteryvhdflkghd);
        imageId1.add(R.drawable.colbutt);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}
