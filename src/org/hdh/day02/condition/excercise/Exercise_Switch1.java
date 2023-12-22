package org.hdh.day02.condition.excercise;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String[]args) {
		//Switch 문으로 학점매기기
		System.out.print("점수를 입력하해주세요 :");
		//100~90 :A
		//89~80 :B
		//79~70 :C
		//69~60 :D
		//59~ :F
		char grade;
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score <101) {
			if(score>=90) {
				grade = 'A';
//				System.out.println("학점은 A 입니다.");
			}
			else if(score>=80){
				grade = 'B';
//				System.out.println("학점은 B 입니다.");
			}
			else if(score>=70){
				grade = 'C';
//				System.out.println("학점은 C 입니다.");
			}
			else if(score>=60){
				grade = 'D';
//				System.out.println("학점은 D 입니다.");
			}
			else 
				grade = 'F';
			System.out.println("학점은"+grade +"입니다.");			
		}
		else
			System.out.println("0 ~ 100사이의 수를 입력해주세요.");	
		
		//switch ~ case
		//switch(변수명){
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// case 값4 : 실행문; break;
		// default : 실행문; break;
		// }
//		
//		switch (score) {
//		case (score >=90) : System.out.println("학점은 A 입니다.");
//		break;
		}
	}
	

