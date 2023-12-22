package org.hdh.day01.basic;

public class Exam_1Variable {
	public static void main (String []args) {
		//숫자, 문자, 문자열
		//변수일수 있는 숫자(정수,실수),문자,문자열을 자바에서는 세분화해서 다룬다.
		int a = 3;		// int에는 숫자 정수만들어가야해
		char b = 'B';		//char 에는 딱 한개의 문자만들어가야해
		String c = "ABC"; // String 에는 문자열이 들어갈수있어 숫자 X
		//자바에서는 변수에 들어갈 데이터들의 자료형을 정해놓고시작한다.
		//자바는 타입을 정해놓고 정해진 데이터로 초기화 해야함
		//만약 다르면 Type mismatch : cannot convert from A to B
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		
		
}
}