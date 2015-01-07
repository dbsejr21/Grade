package com.maple.grade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//  Subject 객체배열 초기화
		Subject[] sa = new Subject[20];
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
		Calculator c = new Calculator();
		c.eachGrade(sa);
		
		// 표준출력
		Printer p = new Printer();
		p.printEach(sa);
		p.printSum(sa , c);
		p.printTotGrade(sa, c, 5);

		// 파일출력
		FileWriter fw = new FileWriter("grade.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		
		TextPrinter tp = new TextPrinter();
		tp.printFile(fw, bw, sb, sa, c);
	
		
	}

}