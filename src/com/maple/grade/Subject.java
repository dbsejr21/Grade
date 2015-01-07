package com.maple.grade;

public class Subject {
		private String name;
		private int score;
		private String grade;
		private float grade2;
		
		public Subject(String s, int n) {
			// TODO Auto-generated constructor stub
			this.name = s;
			this.score = n;
		}
		
		public Subject() {
			// TODO Auto-generated constructor stub
		}

		public void setGrade(String s) {
			this.grade = s;
		}
		
		public void setName(String s) {
			this.name = s;
		}
		
		public void setScore(int n) {
			this.score = n;
		}
		
		public void setGrade2(float f) {
			this.grade2 = f;
		}
		
		public String getGrade() {
			return this.grade;
		}
		
		public String getName() {
			return this.name;
		}

		public int getScore() {
			return this.score;
		}
		
		public float getGrade2() {
			return this.grade2;
		}
		
}
