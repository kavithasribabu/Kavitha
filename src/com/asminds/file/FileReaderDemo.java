package com.asminds.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader r=new FileReader("demo.txt");
		int i;
		while((i=r.read())!=-1) {
			System.out.print((char)i);
		}
		r.close();
	}
}
