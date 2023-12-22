package org.hdh.day02.loop.exercise;

import java.util.Scanner;

public class Excercise_While2 {
	public static void main(String []args) {
		//while문을 이용하여 1~100 사이의 홀수의 합을 출력하시오
		// 1 ~ 100사이의 홀수의 합 :?
		Scanner sc = new Scanner(System.in);
		//첫번째 방법
		int sum =0;
		int i = 1;
		while (i <= 100) {
			if (i%2 !=0) {
			sum = sum + i ;
			}
			i++;
		}
		System.out.println(sum);
		
		
		//두번째 방법
		
//		int sum = 0;
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		while(input!= -1) {
//			sum = sum + input;
//			System.out.print("정수 입력 : ");
//			input = sc.nextInt();
			
		}
		
		
		
		
		
		//1. for문
		//for (초기식; 조건문;증가식 ){실행문}
			
		//2.While문
		//초기식;
		//while(조건식) {실행문; 증가식;}

	}
