package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		FileWriter fw = new FileWriter("grade.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		
		Calculator c = new Calculator();
		
		Subject[] sa = new Subject[20];
		sa[0] = new Subject("수학", c.calc(100));
		
		Printer p = new Printer();
		p.print(sa[0]);
		
		TextPrinter tp = new TextPrinter();
		tp.printFile(fw, bw, sb, sa);
	
		
	}

}