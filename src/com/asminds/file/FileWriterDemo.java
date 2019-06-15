package com.asminds.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("demo.txt");
		f.write("AsmindsTech");
		f.close();
		System.out.println("Hiii Suceess");
	}
}
