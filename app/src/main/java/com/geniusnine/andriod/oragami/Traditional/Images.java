package com.geniusnine.andriod.oragami.Traditional;

import com.geniusnine.andriod.oragami.R;

import java.util.ArrayList;
import java.util.Random;


public class Images {

	private Random randNo;
	private ArrayList<Integer> imageId;

	public Images() {
		imageId = new ArrayList<Integer>();
		imageId.add(R.drawable.bird);
		imageId.add(R.drawable.birdorigami);
		imageId.add(R.drawable.cranee);
		imageId.add(R.drawable.sparrow);
		imageId.add(R.drawable.duck);
		imageId.add(R.drawable.swan);

		imageId.add(R.drawable.owl);
		imageId.add(R.drawable.peacock);
		imageId.add(R.drawable.pigeon);
        imageId.add(R.drawable.bee);
        imageId.add(R.drawable.cicada);
        imageId.add(R.drawable.crow);
        imageId.add(R.drawable.ducky);
        imageId.add(R.drawable.ladybugg);
        imageId.add(R.drawable.parrot);
        imageId.add(R.drawable.pelican);

	}




	public int getImageId() {
		randNo = new Random();
		return imageId.get(randNo.nextInt(imageId.size()));
	}

	public ArrayList<Integer> getImageItem() {
		return imageId;
	}
}
