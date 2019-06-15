package com.asminds.corejava.watsapp;

public class watsapp {
	void watsapp(String a)
	{
		System.out.println(a);
	}
	void watsapp(String a ,String b)
	{
		System.out.println(a+" "+b);
	}
	void watsapp(String a,String b,String c)
	{
		System.out.println("video call");
	}
 public static void main(String[] args)
 {
	  watsapp a=new watsapp();
	  a.watsapp("msg");
	  a.watsapp("msg","voice call");
	  
 }
}
