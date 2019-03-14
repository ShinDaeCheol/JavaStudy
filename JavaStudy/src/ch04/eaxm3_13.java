package ch04;

public class eaxm3_13 {
	public static void main(String[] args) {

//	int total =0;
//	for(int i =1; i<100; i++) {
//		total+=i;
//	}
//	System.out.println("гу->"+total);
//	

		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				total +=i;
				System.out.println(i);
			}
		}
		System.out.println("гу:" + total);

	}
}