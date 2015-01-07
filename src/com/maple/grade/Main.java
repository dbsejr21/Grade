package com.maple.grade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		Printer p = new Printer();
		Subject[] sa = new Subject[20];
		
		//  Subject 객체배열 초기화
		for (int i = 0; i < sa.length; i++){
			sa[i] = new Subject();
		}
		
		// 사용자 입력 하드코딩
		sa[0] = new Subject("국어", 100);
		sa[1] = new Subject("영어", 80);
		sa[2] = new Subject("수학", 70);
		sa[3] = new Subject("사회", 60);
		sa[4] = new Subject("과학", 50);
		
		// 계산
		c.eachGrade(sa);
		
		// 출력 하드코딩
		System.out.println("총점 : " + c.sumScore(sa));
		System.out.println("평균학점 : " + c.totalGrade(sa, 5));
		
		
		
		
	}

}