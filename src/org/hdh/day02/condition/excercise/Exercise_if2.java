package org.hdh.day02.condition.excercise;

import java.util.Scanner;

public class Exercise_if2 {
	public static void main(String []args) {
		//커피 메뉴를 입력 받고 가격을 알려주는
		//프로그램을 작성하여라
		//주문하시겠어요? 가격을 알려드립니다.
		//(에스프레소,카푸치노,카페라떼,아메리카노)
		//메뉴를 입력해주세요 : 에스프레소
		// 2500원 입니다.
		
		//메뉴를 입력해주세요 : 큐브라떼
		//없는 메뉴입니다.
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println(("에스프레소,카푸치노,카페라떼,아메리카노"));
		System.out.print("메뉴를 입력해주세요 : ");
		//println 은 개행되고
		//print는 옆으로 
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		int price =0;
		if (menu.equals("에스프레소")) { //문자열 비교는 .equals("") 을쓴다
			price = 2500; 
//			System.out.println(menu+" 는 2500원입니다.");				
		}
		else if (menu.equals("카푸치노")) {
			price = 3000;
//			System.out.println(menu+" 는 3000원입니다.");			
		}
		else if (menu.equals("카페라떼")) {
			price = 2000;
//			System.out.println(menu+" 는 2000원입니다.");			
		}
		else if (menu.equals("아메리카노")) {
			price = 1500;
//			System.out.println(menu+" 는 1500원입니다.");			
		}
		else 
			System.out.println("없는 메뉴입니다.");		
		if(price !=0) {
			System.out.println(menu +"는"+ price +"입니다.");			
		}
		
		switch (menu) {
		
		case "에스프레소" : System.out.println("4500원입니다.");
		price = 2500;	
		break;
		case "카푸치노" : System.out.println("4600원입니다.");
		price = 2500;
		break;
		case "카페라떼" : System.out.println("4700원입니다.");
		price = 2500;
		break;
		case "아메리카노" : System.out.println("4800원입니다.");
		price = 2500;
		break;	
		default : System.out.println("없는메뉴1입니다.");
		

		
		
		//switch ~ case
		//switch(변수명){
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// case 값4 : 실행문; break;
		// default : 실행문; break;
		// }
		
//		switch (menu) {
//		
//		case "에스프레소" : System.out.println("4500원입니다.");
//		break;
//		case "카푸치노" : System.out.println("4600원입니다.");
//		break;
//		case "카페라떼" : System.out.println("4700원입니다.");
//		break;
//		case "아메리카노" : System.out.println("4800원입니다.");
//		break;	
//		default : System.out.println("없는메뉴1입니다.");
		
		}
	}
}
