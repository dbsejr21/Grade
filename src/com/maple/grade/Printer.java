package com.maple.grade;

import java.util.ArrayList;

public class Printer {
	
	protected StringBuffer sb;
	
	public Printer() {
		sb = new StringBuffer();		
	}
	
	protected void getEachGradeScore(ArrayList<Subject> listSubject){
		for(Subject s: listSubject){
			sb.append(s.getName() + " : " + s.getGrade() + "(" + s.getScore() + ")" + "\n");
		}
	}
	
	protected void getSumScore(ArrayList<Subject> listSubject, Calculator c){	
		sb.append("총점 : " + c.sumScore(listSubject) + " 점" + "\n");
	}
	
	protected void getAvgGrade(ArrayList<Subject> listSubject, Calculator c){
		sb.append("평균학점 : " + c.totalGrade(listSubject, listSubject.size()) + "\n");
	}
	
	protected void printToStdout(ArrayList<Subject> listSubject, Calculator c){
		getEachGradeScore(listSubject);
		getSumScore(listSubject, c);
		getAvgGrade(listSubject, c);
		System.out.println(sb.toString());
	}
	
}
