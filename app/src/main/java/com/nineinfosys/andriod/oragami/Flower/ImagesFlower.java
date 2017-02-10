package com.nineinfosys.andriod.oragami.Flower;

import com.nineinfosys.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 07-12-2016.
 */

public class ImagesFlower {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesFlower() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.bow);
        imageId1.add(R.drawable.flo);
        imageId1.add(R.drawable.flowe);
        imageId1.add(R.drawable.flower);
        imageId1.add(R.drawable.floww);
        imageId1.add(R.drawable.flow);
        imageId1.add(R.drawable.lotus);
        imageId1.add(R.drawable.paper_all);
        imageId1.add(R.drawable.paper_qul_flow);
        imageId1.add(R.drawable.paper_petals);
        imageId1.add(R.drawable.paper_pink);
        imageId1.add(R.drawable.paper_y_flo);
        imageId1.add(R.drawable.paper_yello);
        imageId1.add(R.drawable.petal);
        imageId1.add(R.drawable.star);
        imageId1.add(R.drawable.paper_rose);
        imageId1.add(R.drawable.zendu);
        imageId1.add(R.drawable.paper_flower);
        imageId1.add(R.drawable.paper_ro_flo);
        imageId1.add(R.drawable.paper_sun);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}
