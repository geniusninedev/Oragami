package com.nineinfosys.andriod.oragami.Plane;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesPlane {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesPlane() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.arrow);
        imageId1.add(R.drawable.dartplane);
        imageId1.add(R.drawable.glider);
        imageId1.add(R.drawable.mattplane);
        imageId1.add(R.drawable.paperplanee);
        imageId1.add(R.drawable.planeee);
        imageId1.add(R.drawable.plannnn);
        imageId1.add(R.drawable.simpleton);
        imageId1.add(R.drawable.triplane);
        imageId1.add(R.drawable.wings);



    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}



