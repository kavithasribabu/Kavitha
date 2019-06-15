package com.asminds.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		TreeSet<String> list=new TreeSet<>();
		list.add("tvp");
		list.add("p");
		list.add("tech");
		list.add("hcl");
		list.add("tech");
		list.add("asminds");
		list.add("tcs");
		Iterator  itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(list);
	}
}
