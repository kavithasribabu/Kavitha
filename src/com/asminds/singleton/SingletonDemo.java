package com.asminds.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		company obj=company.getInstance();
		
	}
}

class company{
	static company ref=new company();
	private company(){
		
	}
	static company  getInstance() {
		return ref;
	}
}