package org.hdh.day04.dimarray.exercise;

public class Exercise_DimArray2 {
	public static void main(String[] args) {
		//문제2
//		5 10 15 20 25
//		4 9 14 19 24
//		3 8 13 18 23 
//		2 7 12 17 22
//		1 6 11 16 21
		//이차원배열 데이터
		int nums[][] = new int [5][5];
		int k =1;
		for(int i = 0; i <nums.length; i++) {
			for(int j = nums.length-1; j >=0; i--) {
				nums[j][i] = k++;
			}
		}
		//이차원배열 출력
		for(int i = 0; i <nums.length; i++) {
			for(int j = nums.length-1; j >=0; i--) {
			System.out.println(nums[j][i] + "\t");
			}
		System.out.println();
		}
}
}



