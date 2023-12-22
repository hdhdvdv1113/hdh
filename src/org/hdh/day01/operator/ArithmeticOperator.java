package org.hdh.day01.operator;

import java.util.Scanner;

public class ArithmeticOperator {
	//초 단위의 정수를 입력받고, 몇시간 , 몇분, 몇초 인지 출력하는 프로그램
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		// 정수를 입력하세요 : 5000
		// 5000초는 1시간, 23분, 20초 입니다.
		//3600초 / 60 -> 60분 / 60 -> 1시간
		//4000초 / 60 / 60 -> 1시간
		// 			-> 66분 % 60 -> 6분
		
		int time = sc.nextInt();
		int hour = time / 60 / 60; // time 을 3600으로 나눈 몫 
		int min = (time / 60) % 60; // 60으로 나눈 time의 몫 을 60으로 나눈 나머지
		int sec = time % 60; //time 을 60으로 나눈 나머지
	
		System.out.println(time+"초는"+hour
				+"시간"+min+"분"+sec+"초 입니다");

		
	}
}
