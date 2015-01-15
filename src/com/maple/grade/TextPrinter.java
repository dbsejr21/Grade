package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// is A 관계
// has A 관계

public class TextPrinter extends Printer{
	
	private FileWriter fileWriter;
	private BufferedWriter bufferdWriter;
	
	public TextPrinter(String filename) throws IOException {
		fileWriter = new FileWriter(filename);
		bufferdWriter = new BufferedWriter(fileWriter);
		strBuffer = new StringBuffer();		
	}

	protected void printToFile(List<Subject> listSubject) throws IOException {
		
		getEachGradeScore(listSubject);
		getSumScore(listSubject);
		getAvgGrade(listSubject);
				
		bufferdWriter.write(strBuffer.toString());
	
		bufferdWriter.flush();
		fileWriter.close();
	}
}