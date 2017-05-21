package com.my.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	public static void main(String[] args) {
		File file = new  File("C://Users//tarun//Desktop//dirlocation//");
		BufferedReader readFileBr;
		try {
			readFileBr = new BufferedReader(new FileReader(file));
			String fileData=null;
		     while ((fileData = readFileBr.readLine()) != null) {
		    	// For ignoring first line 
		      
		    
		   }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}

}
