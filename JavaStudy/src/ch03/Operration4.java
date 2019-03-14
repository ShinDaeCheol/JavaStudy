package ch03;

public class Operration4 {
	// 한줄삭제: 컨트롤 +d

	public static void main(String[] args) {
// 줄복사:컨트롤 +알트+아래화살표
		int num = 2324;
		while (num > 0) {
			int n = num % 10; // 마지막자리수 때어내기
			System.out.println(n);

			num = num / 10;
		}

//		// 첫번째4 뜯어내기
//		
//		int n1 = num % 10; // 4
//
//		// 두번째2숫자뜯어내기
//		num = num / 10; // 232
//		int n2 = num % 10; // 2
//
//		// 세번째3숫자뜯어내기
//		num = num / 10; // 23
//		int n3 = num % 10; // 3
//
//		// 세번째2숫자뜯어내기
//		num = num / 10; // 2
//		int n4 = num % 10; // 2
//
//		System.out.println(n1+n2+n3+n4);
	}
}