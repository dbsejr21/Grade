package com.maple.grade;

public class Subject {
		private String name;
		private int score;
		private String grade;
		private float grade2;
		
		public Subject() {}
		
		public Subject(String s, int n) {
			this.name = s;
			this.score = n;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public float getGrade2() {
			return grade2;
		}

		public void setGrade2(float grade2) {
			this.grade2 = grade2;
		}	
}
