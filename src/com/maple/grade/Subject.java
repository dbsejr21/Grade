package com.maple.grade;

public class Subject {
		private String name;
		private String score;
		
		public Subject(String name, String score) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.score = score;
		}
		
		public void setScore(String score) {
			this.score = score;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getScore() {
			return score;
		}
		
		public String getName() {
			return name;
		}
		
}
