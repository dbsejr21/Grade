package com.maple.grade;

import java.util.List;

public class Calculator {
	
//	private Printer printer;
	
	public void getGrade(List<Subject> listSubject){
		for(Subject subject: listSubject){
			int score = subject.getScore(); 
			if ( score >= 90 && score <= 100){
				subject.setGrade("A");
				subject.setScoreForGrade((float)4.5);
			} else if ( score >= 80 && score <= 89){
				subject.setGrade("B");
				subject.setScoreForGrade((float)3.5);
			} else if ( score >= 70 && score <= 79){
				subject.setGrade("C");
				subject.setScoreForGrade((float)2.5);
			} else if ( score >= 60 && score <= 69){
				subject.setGrade("D");
				subject.setScoreForGrade((float)1.5);
			} else if ( score >= 0 && score <= 59){
				subject.setGrade("F");
				subject.setScoreForGrade((float)0);
			} else {
				System.out.println("invalid score");
				System.exit(-1);
			}
		}
	}
	
	public float totalGrade(List<Subject> listSubject, int subjectCount){
		float grade = 0;
		
		grade = sumGrade(listSubject) / subjectCount;
		
		return grade;
	}
	
	public float sumScore(List<Subject> listSubject){
		float sum = 0;
		
		for(Subject subject: listSubject){
			sum += subject.getScore();
		}
		
		return sum;
	}
	
	public float sumGrade(List<Subject> listSubject){
		float sum = 0;
		
		for(Subject subject: listSubject){
			sum += subject.getScoreForGrade();
		}
		
		return sum;
	}
}

