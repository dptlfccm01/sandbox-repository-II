package com.sampleapp.db.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController {

	List<String> records;
	
	{
		records = new ArrayList<String>();
	}
	public FileController(){}
	
	public void readFile(){
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader("src/resources/db.txt"));
			String line;
			int iteration = 0;
			while((line = reader.readLine()) != null){
				if (iteration == 0){
					iteration += 1;
					continue;
				}
				records.add(line);
			}
			
			setRecords(records);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public void writeToFile(String entry){
		
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/db.txt", true));
			writer.write(entry);
			writer.newLine();
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

	public List<String> getRecords() {
		return records;
	}

	public void setRecords(List<String> records) {
		this.records = records;
	}
	
	
}
