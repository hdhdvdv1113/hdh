package org.hdh.day04.dimarray.exercise;

public class Exercise_DimArray1_2 {
	public static void main(String[] args) {
		//문제1-2
//		 5 4 3 2 1
//		 10 9 8 7 6
//		 15 14 13 12 11
//		 20 19 18 17 16
//		 25 24 23 22 21
//		 5 4 3 2 1
		
		
//		 nums[0][4],nums[0][3],nums[0][2],nums[0][1],nums[0][0]
//       10 9 8 7 6 		
//		 15 14 13 12 11
//		 20 19 18 17 16
//		 25 24 23 22 21
		
		int arrs[][] = new int [5][5];
		int k =1;
		for(int i = 0; i <arrs.length; i++) {
			for(int j = arrs.length-1; j >=0; i--) {
				arrs[i][j] = k--;
			}
		}
		//이차원배열 출력
		for(int i = 0; i <arrs.length; i++) {
			for(int j = arrs.length-1; j >=0; i--) {
			System.out.println(arrs[j][i] + "\t");
			}
		System.out.println();
		}
}
}