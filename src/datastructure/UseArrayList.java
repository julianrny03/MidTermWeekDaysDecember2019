package datastructure;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {

		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */


		ArrayList<String> car = new ArrayList<>();
		car.add("bmw");
		car.add("Nissan");
		car.add("Tesla");
		System.out.println(" values of arrayList = "+ car);
		for (int x =1;x<3;x++){
			System.out.println("sepecified fron index to index =" + car.get(x));
		}


	}

}
