package org.hdh.day01.operator;

public class Exam_2Unary {
	public static void main (String []args) {
		//단항 연산자
		// a++, ++a ->  a = a + 1;
		//후위연산 ,전위연산
		int a1 = 1;
//		System.out.println(a1++);
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는 30
		// a++;
		// a : 11, b : 20 , c : 30
		
		// b = (--a) + b;
//``			10	+	20        30
		// a : ?, b : ?, c : 30
		// c = (a++) + (--b);
		   //       10      19   29 
		
		// a : ?, b : ?, c : ?

		// a : 10, b : 30 c : 40
//		a:11 b: 29 c: 39 
		
		
		
		//정답  a:11, b:29, c:39
		
		// 문제2
		int x = 100;
		int y = 33;
		int z = 0;
		
		// x는 100, y는 33, z는 0
		 x--; 
		// x : 99
		 z = x-- + --y;
		// z = 99 + 32 =   131 
		// x: 98 ,y : 32
		 x = 99 + x++ + x;
		// x = 99 +98 + 99 =       296
		 //x : 99  y : 32
		 y = y-- + y + ++y;
		//      32 + 31 + 32 =     95
		// x : 296, y : 95, z : 131
		System.out.println("x: "+ x + ",y: "+ y + ",z: "+z);
	}
}
