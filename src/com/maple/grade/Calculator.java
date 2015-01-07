package com.maple.grade;

public class Calculator {
	void eachGrade(Subject[] sa){
		
		for (int i = 0; i < sa.length; i++){
			int score = sa[i].getScore(); 
			if ( score >= 90 && score <= 100){
				sa[i].setGrade("A");
				sa[i].setGrade2((float)4.5);
			} else if ( score >= 80 && score <= 89){
				sa[i].setGrade("B");
				sa[i].setGrade2((float)3.5);
			} else if ( score >= 70 && score <= 79){
				sa[i].setGrade("C");
				sa[i].setGrade2((float)2.5);
			} else if ( score >= 60 && score <= 69){
				sa[i].setGrade("D");
				sa[i].setGrade2((float)1.5);
			} else if ( score >= 0 && score <= 59){
				sa[i].setGrade("F");
				sa[i].setGrade2((float)0);
			} else {
				System.out.println("invalid score");
				System.exit(-1);
			}
		}
	}
	
	float totalGrade(Subject[] sa, int n){
		float grade = 0;
		grade = sumGrade(sa) / n;
		
		
		return grade;
	}
	
	float sumScore(Subject[] sa){
		float sum = 0;
		for(int i = 0; i < sa.length; i++){
			sum += sa[i].getScore();
		}
		return sum;
	}
	
	float sumGrade(Subject[] sa){
		float sum = 0;
		for(int i = 0; i < sa.length; i++){
			sum += sa[i].getGrade2();
		}
		return sum;
	}
}

