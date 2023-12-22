package org.hdh.day02.loop.exercise;

import java.util.Scanner;

public class Excercise_For2 {
	public static void main(String []args) {
			//정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일때만
		// 그수의 구구단을 출력하세요.
		//단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야
		//합니다." 를출력하세요.
		System.out.print("양수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input>=1 && input <=9) {
			for(int i =1; i <=9; i++)
				System.out.println(input+ "*"+ i+ "=" +input*i);
//			System.out.print("2 * 1 = 2");			
//			System.out.print("2 * 2 = 4");			
//			System.out.print("2 * 3 = 6");			
//			System.out.print("2 * 4 = 8");			
//			System.out.print("2 * 5 = 10");			
//			System.out.print("2 * 6 = 12");			
//			System.out.print("2 * 7 = 14");			
//			System.out.print("2 * 8 = 16");			
//			System.out.print("2 * 9 = 18");			
//			
		}
		else
			System.out.print("1~9사이의 양수를 입력하여야합니다.");
	}
}
