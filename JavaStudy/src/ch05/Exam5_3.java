package ch05;

public class Exam5_3 {
	public static void main(String[] args) {

		// 배열 nums 각 요소의 순서가 랜덤으로 섞일 수 있도록 코드 작성

		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		for (int i = 0; i < 10000; i++) {
			int random = (int) (Math.random() * 7);
			char temp = 0;
			temp = nums[0];
			nums[0] = nums[random];
			nums[random] = temp;

		}

		System.out.println(nums);
	}
}
