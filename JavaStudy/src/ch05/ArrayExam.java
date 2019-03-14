package ch05;

public class ArrayExam {
	public static void main(String[] args) {
		int[] s1 = { 1, 2, 3, 4 };
		for(int i =0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		int last=s1[s1.length-1]; //마지막숫자를 가져올때,마지막에서 두번때숫자를가지고올때[s1.length-2]
		System.out.println(last);
		
		
		int[] s2 = new int[4];
		s2[0] = 10;
		s2[1] = 20;
		s2[2] = 30;
		s2[3] = 40;
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s1.length);
	}
}
