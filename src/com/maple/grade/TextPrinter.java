package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextPrinter extends Printer{
	
	private FileWriter fw;
	private BufferedWriter bw;
	
	public TextPrinter(String filename) throws IOException {
		fw = new FileWriter(filename);
		bw = new BufferedWriter(fw);
		sb = new StringBuffer();		
	}

	protected void printToFile(ArrayList<Subject> listSubject, Calculator c) throws IOException {
		
		getEachGradeScore(listSubject);
		getSumScore(listSubject, c);
		getAvgGrade(listSubject, c);
				
		bw.write(sb.toString());
	
		bw.flush();
		fw.close();
	}
}
