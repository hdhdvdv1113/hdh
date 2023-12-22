package org.hdh.day01.inputsc;

import java.util.Scanner;

public class Exam_1ScannerTest1copy {
	public static void main(String[] args) {
		//Scanner를 이용하여 이름, 도시, 나이, 체중, 독신여부를입력
		//받고 다시 출력하는 프로그램을 작성하라.
		
		// scanner는 클래스이다.
		// 읽은 바이트를 문자,정수,실수,불리언,문자열 등 
		// 다양한 타입으로 변환하여 리턴하는 클래스이다.
		
System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로분리하여 입력하세요");
Scanner sc = new Scanner(System.in); //sc 라는 Scanner 클래스 생성
System.out.println("이름을 입력하세요");
String name = sc.next(); // Scanner 클래스안의 문자열 메소드 선언

	}
}