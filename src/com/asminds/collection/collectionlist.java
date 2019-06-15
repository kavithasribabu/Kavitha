package com.asminds.collection;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class collectionlist {
	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("arul");
		list.add("uma");
		list.add("kavi");
		list.add("kavi");
		
		TreeSet<String> obj=new TreeSet<>();
		obj.addAll(list);
		
		Iterator<String> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
