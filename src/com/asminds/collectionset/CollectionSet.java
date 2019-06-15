package com.asminds.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("kavi");
		set.add("arul");
		set.add("kadal");
		set.add("uma");
		set.add("arul");
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}

}
