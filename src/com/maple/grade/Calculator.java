package com.maple.grade;

public class Calculator {
	String calc(int n){
		String score = null;
		if ( n >= 90 && n <= 100){
			score = "A";
		} else if ( n >= 80 && n <= 89){
			score = "B";
		} else if ( n >= 70 && n <= 79){
			score = "C";
		} else if ( n >= 60 && n <= 69){
			score = "D";
		} else {
			score = "F";
		} 
		return score;	
	}
}
