package com.maple.grade;

public class Subject {
		private String name;
		private int score;
		private String grade;
		
		public Subject(String name, int score) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.score = score;
		}
		
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setScore(int score) {
			this.score = score;
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
		
}
