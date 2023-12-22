package org.hdh.day02.loop.exercise;

import java.util.Scanner;

public class Excercise_Calculator {

	public static void main(String []args) {
		 
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		System.out.print("정수 하나 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.print("정수 하나 더 입력 : ");
//		int n2 = sc.nextInt();
//		System.out.print("연산자 입력 (+,-,*,/,%) : ");
//		String oper = sc.next();
//		if(oper == "+") {
//		}
//		result = (n1 + n2);
//	
//		System.out.println(result);

		

		Scanner sc = new Scanner(System.in);
		//for(;;) {}
		while(true){
			System.out.print("정수 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int n2 = sc.nextInt();
			System.out.print("연산자 입력 (+,-,*,/,%) : ");
			char oper = sc.next().charAt(0); //.charAt(0)이 sc.next()에 입력받는 문자중첫번째값이라는것
			int result = 0;
			switch(oper) {
			case '+' : result = n1 + n2;break;
			case '-' : result = n1 - n2;break;
			case '*' : result = n1 * n2;break;
			case '/' : result = n1 / n2;break;
			case '%' : result = n1 % n2;break;
			}
			System.out.printf("%d %c %d = %d\n", n1,oper,n2,result);
		}
	}
}
//개씨발 