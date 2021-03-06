package icehs.science.chapter06;

public class Student {

	String stuName;
	String stuId;
	
	int korScore;
	int engScore;
	int mathScore;
	
	int avgScore;
	
	void printStudentInfo() {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 목록 : " + stuId);
		System.out.println("국어 성적 : " + korScore);
		System.out.println("영어 성적 : " + engScore);
		System.out.println("수학 성적 : " + mathScore);
		System.out.println("성적 총점 : " + (korScore + engScore + mathScore));
		System.out.println("평균 점수 : " + calculateAVG());
	}
	
	int calculateAVG() {
		avgScore = (korScore + engScore + mathScore) / 3;
		return avgScore;
	}
	
	void changeStudentId(String newStuId) {
		stuId = newStuId;
	}
	
}
