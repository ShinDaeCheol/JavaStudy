package ch06;

public class Exam06_1 {
	 public static void main(String[] args) {
//		 �Ʒ� �ڵ尡 ���۵� �� �ֵ��� �ڵ� �ۼ�
//		 ��� ���
//		 plus => 8
//		 minus => 2

		 int result1 = plus(5, 3);
		 System.out.println("plus => " + result1);

		 int result2 = minus(5, 3);
		 System.out.println("minus => " + result2);
		 }

		 public static int plus(int num1, int num2) {
		 // �ڵ� �ۼ�
			 int puls=num1+num2;
			 return puls;
		 }
		 public static int minus(int num1, int num2) {
		 // �ڵ� �ۼ�
//			 int minus= num1-num2;
//			 return minus;
			 return num1-num2;
		 }

}
