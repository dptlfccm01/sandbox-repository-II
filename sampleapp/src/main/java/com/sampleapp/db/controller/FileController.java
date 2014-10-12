package com.sampleapp.db.controller;

import java.io.*;

public class FileController {

	public FileController(){}
	
	public void readFile(){
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader("src/resources/db.txt"));
			String line;
			while((line = reader.readLine()) != null){
				System.out.println("OUT> "+line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
