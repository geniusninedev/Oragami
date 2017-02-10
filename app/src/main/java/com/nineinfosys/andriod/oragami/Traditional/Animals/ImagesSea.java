package com.nineinfosys.andriod.oragami.Traditional.Animals;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 06-12-2016.
 */

public class ImagesSea {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesSea() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.crab);
        imageId1.add(R.drawable.goldfish);
        imageId1.add(R.drawable.penguine);
        imageId1.add(R.drawable.seabear);
        imageId1.add(R.drawable.whalee);
        imageId1.add(R.drawable.turtle);
        imageId1.add(R.drawable.goldy);
        imageId1.add(R.drawable.whale);
        imageId1.add(R.drawable.whaley);
        imageId1.add(R.drawable.turtlee);
        imageId1.add(R.drawable.seshore);


    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}
