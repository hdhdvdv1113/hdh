package org.hdh.day02.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		//1*1 =1 
		//1*2 =2
		//1*3 =3
		for (int j=1; j <10; j++) {
			for(int i = 1; i <10; i++) {
				System.out.println(j +"*"+i+" = "+ j*i);
                System.out.print("\t");
			}		
            System.out.println();
		}
	}
}
