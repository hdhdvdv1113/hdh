package org.hdh.day04.dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String[] args) {


		
		
		
//		
//		문제1
//	 1 2 3 4 5
//	 6 7 8 9 10
//	 11 12 13 14 15
//	 16 17 18 19 20
//	 21 22 23 24 45
//		이차원 배열 데이터 입력
		int nums[][] = new int [5][5];
		int k =1;
		for(int j = 0; j <nums.length; j++) {
			for(int i =0; i <nums[j].length; i++) {
				nums[j][i] = k++;
			}
		}
		//이차원배열 출력
		for(int j = 0; j <nums.length; j++) {
			for(int i =0; i <nums[j].length; i++) {
			System.out.println(nums[j][i] + "\t");
			}
		System.out.println();
		}
}
}
