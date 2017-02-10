package com.nineinfosys.andriod.oragami.Box;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesBox {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesBox() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.bagbox);
        imageId1.add(R.drawable.box);
        imageId1.add(R.drawable.boxx);
        imageId1.add(R.drawable.boxxx);
        imageId1.add(R.drawable.cupbox);
        imageId1.add(R.drawable.fancybox);
        imageId1.add(R.drawable.housebox);
        imageId1.add(R.drawable.fancyyy);
        imageId1.add(R.drawable.multibox);
        imageId1.add(R.drawable.rabbitbox);
        imageId1.add(R.drawable.shoebox);
        imageId1.add(R.drawable.shopbox);
        imageId1.add(R.drawable.tribox);
        imageId1.add(R.drawable.triboxy);
        imageId1.add(R.drawable.bitzz);
        imageId1.add(R.drawable.boxy);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}



