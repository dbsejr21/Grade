package com.maple.grade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		Printer p = new Printer();
		Subject[] sa = new Subject[20];
		
		sa[0] = new Subject("수학", c.calc(100));
		
		p.print(sa[0]);
		
		
	}

}