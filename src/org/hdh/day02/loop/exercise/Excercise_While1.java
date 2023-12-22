package org.hdh.day02.loop.exercise;

import java.util.Scanner;

public class Excercise_While1 {
	public static void main(String []args) {
		//while  문을 이용하여 -1이 입력될때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while(i<10) {
			System.out.print("정수를 입력 하고 마지막에 -1 을 입력 하세요");
			int input = sc.nextInt();
			if(input ==-1) break;
			sum = sum + input;
					i++;
			}
		System.out.println("합은"+(sum-1));
	}
	}

//1. for문
//for (int i = 0; i <10 ; i++){실행문}