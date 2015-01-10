package com.maple.grade;

public class Subject {
		private String name;
		private int score;
		private String grade;
		private float scoreForGrade;
		
		public Subject() {
		}
		
		public Subject(String name, int score) {
			this.name = name;
			this.score = score;
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

		public float getScoreForGrade() {
			return scoreForGrade;
		}

		public void setScoreForGrade(float scoreForGrade) {
			this.scoreForGrade = scoreForGrade;
		}
}
