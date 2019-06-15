package com.asminds.collection.map;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionMap {
	public static void main(String[] args) {
		
		String s="tcs";
	 ArrayList<String> list= new ArrayList<String>();
	 list.add(s);
	 Iterator<String> itr=list.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
	}

}