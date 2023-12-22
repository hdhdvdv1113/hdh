package org.hdh.day01.basic;

public class Exam_3DataType {
	public static void main (String[]args) {
		// 기본형
		// 정수, 실수, 문자, 문자열, 논리형
		// 정수 4가지(byte short int long)
		// 실수 2가지(float, double)
		// 문자 (char)
		// 논리형 (boolean)
		// 참조형 
		// 문자열 Sting
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
		
		//종류가 많은 이유는 갖을수 있는 최대값(범위)가 달라지기때문
		
		//정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l;
		
		// 실수 part
		// 실수에서 왜 double 를 더많이 쓸까?
		float fNum = 23.026f;
		double dNum = 23.026;
		//float 보다 크기가 두배라서 double임. 
		//float 접미사가필요함
	}
}
