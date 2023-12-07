package com.java.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(); 
		
		List<Integer> list2 = new LinkedList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1); // [10, 20, 30]
		
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		System.out.println(list2); // [40, 50, 60]
		
		
		List<Integer> vector = new Vector<>();
		
		vector.add(70);
		vector.add(80);
		vector.add(90);
		
		System.out.println(vector); // works same as ArrayList and other but is not as faster as them
									// as it is synchronized & this would not allow other processes to work parallel. 
	}

}
