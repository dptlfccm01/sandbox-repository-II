package com.sampleapp.db.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileControllerTest {

	@Test
	public void readFile(){
		FileController fc = new FileController();
		fc.readFile();
		assertTrue(true);
	}

}
