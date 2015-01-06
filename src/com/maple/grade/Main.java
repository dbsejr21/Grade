package com.maple.grade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		Printer p = new Printer();
		Subject[] sa = new Subject[20];
		
		sa[0] = new Subject("국어", c.calc(100));
		sa[1] = new Subject("영어", c.calc(80));
		sa[2] = new Subject("수학", c.calc(70));
		sa[3] = new Subject("사회", c.calc(60));
		sa[4] = new Subject("과학", c.calc(50));
		
		p.print(sa[0]);
		
		
	}

}