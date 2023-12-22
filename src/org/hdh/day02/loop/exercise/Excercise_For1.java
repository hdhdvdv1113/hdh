package org.hdh.day02.loop.exercise;

public class Excercise_For1 {
	public static void main(String []args) {
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
	int sum = 0;
		for(int i=1; i <=10; i++) { //맞으면 실행하고 증가
									//틀리면 실행하지않고 증가
			sum = sum +i;
			if(i<=9)
				System.out.print(i+"+");
			else
					System.out.print(i+"=");
		}
		// 1+ 
		// 2+
		// 3+
		// 4+
		//1+2+3+4+5+6+7+8+9+10=
		System.out.println(sum);
		//55
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
		}
		
	}
