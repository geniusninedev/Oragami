package com.geniusnine.andriod.oragami.Traditional.Animals;

import com.geniusnine.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 06-12-2016.
 */

public class ImagesAnimal {
    private Random randNo;
    private ArrayList<Integer> imageId1;
    public ImagesAnimal() {
        imageId1 = new ArrayList<Integer>();
        imageId1.add(R.drawable.adog);
        imageId1.add(R.drawable.bearface);
        imageId1.add(R.drawable.cat);
        imageId1.add(R.drawable.cow);
        imageId1.add(R.drawable.dog);
        imageId1.add(R.drawable.dogy);
        imageId1.add(R.drawable.elephant);
        imageId1.add(R.drawable.fox);
        imageId1.add(R.drawable.giraffe);
        imageId1.add(R.drawable.koala);
        imageId1.add(R.drawable.monkey);
        imageId1.add(R.drawable.mouse);
        imageId1.add(R.drawable.panda);
        imageId1.add(R.drawable.pig);
        imageId1.add(R.drawable.rabitt);
        imageId1.add(R.drawable.rhino);
        imageId1.add(R.drawable.sheepface);
        imageId1.add(R.drawable.snake);
        imageId1.add(R.drawable.tadpole);
        imageId1.add(R.drawable.tyranosaure);

    }




    public int getImageId() {
        randNo = new Random();
        return imageId1.get(randNo.nextInt(imageId1.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId1;
    }
}


