package com.maple.grade;

import java.util.List;

// 인터페이스화,

public class Printer {
	
	private Calculator calculator;
	
	protected StringBuffer strBuffer;
	
	public Printer() {
		strBuffer = new StringBuffer();
		calculator = new Calculator();
	}
	
	public void getEachGradeScore(List<Subject> listSubject){
		for(Subject subject: listSubject){
			strBuffer.append(subject.getName() + " : " + subject.getGrade() + "(" + subject.getScore() + ")" + "\n");
		}
	}
	
	public void getSumScore(List<Subject> listSubject){	
		strBuffer.append("총점 : " + calculator.sumScore(listSubject) + " 점" + "\n");
	}
	
	public void getAvgGrade(List<Subject> listSubject){
		strBuffer.append("평균학점 : " + calculator.totalGrade(listSubject, listSubject.size()) + "\n");
	}
	
	public void printToStdout(List<Subject> listSubject){
		getEachGradeScore(listSubject);
		getSumScore(listSubject);
		getAvgGrade(listSubject);
		System.out.println(strBuffer.toString());
	}
	
}
