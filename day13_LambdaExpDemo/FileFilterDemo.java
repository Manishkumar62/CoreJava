package com.day13_LambdaExpDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {

	public static void main(String[] args) {
		FileFilter filter = (File pathname) -> pathname.getName().endsWith(".pdf");
		File dir=new File("C:\\Users\\Manish\\Downloads");
		File contents[] = dir.listFiles(filter);
		
		for(File file:contents) {
			System.out.println(file);
		}

	}

}
