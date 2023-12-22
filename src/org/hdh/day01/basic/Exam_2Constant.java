package org.hdh.day01.basic;

public class Exam_2Constant {
	public static void main(String []args) {
		// 변수는 소문자로 시작, 상수는 모두 대문자
		final double PI = 3.14; //상수를 대문자로 짓는것은 약속임!
		// 원의 넓이 구하는 식
		// PI * r * r 
		double r = 10.2;
		r = 5.4;
		// PI = 3.24; 재할당 불가능 -> 변하지 않는 수 -> 상수
		double circleArea = r * r * PI;
		System.out.println(PI);
		System.out.println(circleArea);
		System.out.println("원의면적은 "+ circleArea +"입니다.");
		
		//문자열은 기본타입이 아니다. 문자열은 참조형이다. 
		//리터럴 은 값이다 
		
	}
}
