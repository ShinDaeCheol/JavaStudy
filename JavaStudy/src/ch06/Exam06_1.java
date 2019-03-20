package ch06;

public class Exam06_1 {
	 public static void main(String[] args) {
//		 아래 코드가 동작될 수 있도록 코드 작성
//		 출력 결과
//		 plus => 8
//		 minus => 2

		 int result1 = plus(5, 3);
		 System.out.println("plus => " + result1);

		 int result2 = minus(5, 3);
		 System.out.println("minus => " + result2);
		 }

		 public static int plus(int num1, int num2) {
		 // 코드 작성
			 int puls=num1+num2;
			 return puls;
		 }
		 public static int minus(int num1, int num2) {
		 // 코드 작성
//			 int minus= num1-num2;
//			 return minus;
			 return num1-num2;
		 }

}
