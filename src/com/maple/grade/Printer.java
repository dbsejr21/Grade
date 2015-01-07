package com.maple.grade;

public class Printer {
	
	void printEach(Subject[] sa){
		for(int i = 0; i < sa.length; i++){
			if (sa[i].getName() == null){
				break;
			}
			System.out.println(sa[i].getName() + " : " + sa[i].getGrade() + "(" + sa[i].getScore() + ")");
		}
	}
	
	void printSum(Subject[] sa, Calculator c){	
		System.out.println("총점 : " + c.sumScore(sa) + " 점");
	}
	
	void printTotGrade(Subject[] sa, Calculator c, int n){
		System.out.println("평균학점 : " + c.totalGrade(sa, 5));
	}
	
}
