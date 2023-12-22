package org.hdh.day01.operator;

public class Exam_Logical {
	public static void main(String []args) {
		// 논리연산자 예제
		// Oracle에서 WHERE 절 뒤에 적었던 논리연산자 AND, OR
		// 와 같은 역활을 함.
		// EX) 남자이면서 평균평점 4.3이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람
		boolean result1 , result2, result3, result4;
//		boolean result2; 
//		boolean result3;
	//	boolean result4;
			//num1 cannot be resolved to a variable
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2); // && 하나라도 거짓이면 거짓
		result2 = (num1 < num2) || (num1 == num2); // || 둘중하나만 참이면 참
		result3 = (num1 > num2) && (num1 != num2); // && 하나라도 거짓이면 거짓
		result4 = (num1 > num2) || (num1 == num2); 
		// result 1의 결과값 : false
		// result 2의 결과값 : false
		// result 3의 결과값 : true
		// result 4의 결과값 : true 
		
		//      ||  하나라도 참이면 참 곧 앞에가 참이면 뒤는 연산안함
		//	 	&&  하나라도 거짓이면 거짓 앞에가 거짓이면 뒤는 연산안함
		int a = 70;
		int b = 55;
		// a는 70, b는 55다.
	 result1 = (a == b) || (a++ <100);  //true
//					false      true a = 71
		 result2 = (a < b) && (--b < 55);  // false
//		 			  false       뒤는연산안함
// 				a = 71 , b 55
		result3 = (a != b) && (b-- < a++); //true
		         //    true       true
		//		a   72  	b 54
		 result4 = (a++ != b) || (b++ >= 85); //true 
	//			       72 true      뒤는연산안함
		// a : 73 , b : 54
		System.out.println(a +","+ b);
		

		
		
	}
}
