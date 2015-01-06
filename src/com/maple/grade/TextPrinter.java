package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextPrinter {
	
	void printFile(FileWriter fw, BufferedWriter bw, StringBuffer sb, Subject[] sa) throws IOException {
		// TODO Auto-generated constructor stub
		
		sb.append(sa[0].getName() + " : " + sa[0].getScore());		
		bw.write(sb.toString());
	
		bw.flush();
		fw.close();
	}
}
