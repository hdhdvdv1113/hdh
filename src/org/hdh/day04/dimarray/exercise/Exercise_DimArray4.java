package org.hdh.day04.dimarray.exercise;

public class Exercise_DimArray4 {
	public static void main(String[] args) {
		//문제4
//		1	2	3	4	5
//		10	9	8	7	6
//		11	12	13	14	15
//		20	19	18	17	16
//		21	22	23	24	25
		

		int nums[][] = new int [5][5];
		int k =1;
		for(int i = 0; i <nums.length; i++) {
			if(i % 2 ==0) {
				for(int j =0 ; j < nums[i].length; j++) {
					nums[i][j] = k++;
				}	
			}
			else {
				for(int j = nums.length-1 ; j >=0; j--) {
					nums[i][j] = k++;
				}				
			}
		}
		//이차원배열 출력
		for(int i = 0; i <nums.length; i++) {
			for(int j =0 ; j < nums[i].length; j++) {
			System.out.println(nums[i][j] + "\t");
			}
		System.out.println();
		}
}
}


