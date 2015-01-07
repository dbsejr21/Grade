package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextPrinter {
	
	void printFile(FileWriter fw, BufferedWriter bw, StringBuffer sb, Subject[] sa, Calculator c) throws IOException {
		// TODO Auto-generated constructor stub
		
		for(int i = 0; i < sa.length; i++){
			if (sa[i].getName() == null){
				break;
			}
			sb.append(sa[i].getName() + " : " + sa[i].getGrade() + "(" + sa[i].getScore() + ")" + "\n");
		}
		sb.append("총점 : " + c.sumScore(sa) + " 점" + "\n");
		sb.append("평균학점 : " + c.totalGrade(sa, 5) + "\n");
		
		//sb.append(sa[0].getName() + " : " + sa[0].getScore());		
		bw.write(sb.toString());
	
		bw.flush();
		fw.close();
	}
}
