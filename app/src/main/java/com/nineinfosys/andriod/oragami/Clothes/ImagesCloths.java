package com.nineinfosys.andriod.oragami.Clothes;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesCloths {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesCloths() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.bowwww);
        imageId1.add(R.drawable.cocktail);
        imageId1.add(R.drawable.foldshirt);
        imageId1.add(R.drawable.onepiece);
        imageId1.add(R.drawable.onepiesce);
        imageId1.add(R.drawable.shirt);
        imageId1.add(R.drawable.trouser);
        imageId1.add(R.drawable.tiee);
        imageId1.add(R.drawable.skirt);
        imageId1.add(R.drawable.shirty);
        imageId1.add(R.drawable.tie);
        imageId1.add(R.drawable.foldshirt);
        imageId1.add(R.drawable.shir);
        imageId1.add(R.drawable.tieee);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}

