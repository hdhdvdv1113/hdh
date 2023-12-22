package org.hdh.day02.loop;

public class Exam_ForDouble2 {
	public static void main(String [] args) {
        // 11=1 12=2 13=3 .... 19=9
        // 21=2 22=4 23=6 .... 29=18
        // 31=3 32=6 33=9 .... 39=27
        // 41=4 42=8 43=12 .... 49=36
        // 51=5 52=10 53=15 .... 59=45
        for(int j = 1; j < 10; j++) {
            for(int i = 1; i < 10; i++) {
                System.out.print(j + " * "+i+" = " + j*i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}