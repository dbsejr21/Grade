package com.maple.grade;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		// Subject 객체 리스트 초기화
		ArrayList<Subject> listSubject = new ArrayList<Subject>();

		// 사용자 입력 하드코딩
		listSubject.add(new Subject("국어", 100));
		listSubject.add(new Subject("영어", 80));
		listSubject.add(new Subject("수학", 70));
		listSubject.add(new Subject("사회", 60));
		listSubject.add(new Subject("과학", 50));
	
		// 계산
		Calculator calculator = new Calculator();
		calculator.getGrade(listSubject);
		
		// 표준출력
		Printer printer = new Printer();
		printer.printToStdout(listSubject);

		// 파일출력
		TextPrinter textPrinter = new TextPrinter("grade.txt");
		textPrinter.printToFile(listSubject);
		
	}
}