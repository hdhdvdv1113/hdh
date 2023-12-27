package org.hdh.day04.dimarray.exercise;

public class Exercise_DimArray3 {
	public static void main(String[] args) {
		//문제3
//		1	6	11	16	21
//		2	7	12	17	22
//		3	8	13	18	23
//		4	9	14	19	24
//		5	10	15	20	25

		//nums[0][0],num[1][0],num[2][0],nums[3][0]  .....

		int nums[][] = new int [5][5];
		int k =1;
		for(int i = 0; i <nums.length; i++) {
			for(int j =0 ; j < nums[i].length; j++) {
				nums[j][i] = k++;
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
