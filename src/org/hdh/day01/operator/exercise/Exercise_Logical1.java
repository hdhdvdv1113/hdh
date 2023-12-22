package org.hdh.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main (String[] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a 
		// 영어 대문자 확인 : false
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		//입력받은 문자열중 첫번째 문자를 잘라서 word에 저장
		char word = sc.next().charAt(0);
		// char (문자) 숫자로 변환될 수 있다. by 유니코드
		// A - 65 , Z- 90
//		String words = sc.next(); 문자열은 이렇게 써야함 근데 문자 하나니 저렇게씀
//		boolean result = (word == 'A') || (word == 'B')||
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
		//캐릭터가 왜 숫자야? 
		
	}
}
