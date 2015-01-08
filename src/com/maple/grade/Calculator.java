package com.maple.grade;

import java.util.ArrayList;

public class Calculator {
	
	protected void calcEachGrade(ArrayList<Subject> listSubject){
		for(Subject s: listSubject){
			int score = s.getScore(); 
			if ( score >= 90 && score <= 100){
				s.setGrade("A");
				s.setGrade2((float)4.5);
			} else if ( score >= 80 && score <= 89){
				s.setGrade("B");
				s.setGrade2((float)3.5);
			} else if ( score >= 70 && score <= 79){
				s.setGrade("C");
				s.setGrade2((float)2.5);
			} else if ( score >= 60 && score <= 69){
				s.setGrade("D");
				s.setGrade2((float)1.5);
			} else if ( score >= 0 && score <= 59){
				s.setGrade("F");
				s.setGrade2((float)0);
			} else {
				System.out.println("invalid score");
				System.exit(-1);
			}
		}
	}
	
	protected float totalGrade(ArrayList<Subject> listSubject, int n){
		float grade = 0;
		
		grade = sumGrade(listSubject) / n;
		
		return grade;
	}
	
	protected float sumScore(ArrayList<Subject> listSubject){
		float sum = 0;
		
		for(Subject s: listSubject){
			sum += s.getScore();
		}
		
		return sum;
	}
	
	protected float sumGrade(ArrayList<Subject> listSubject){
		float sum = 0;
		
		for(Subject s: listSubject){
			sum += s.getGrade2();
		}
		
		return sum;
	}
}

