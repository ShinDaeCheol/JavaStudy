package ch05;

public class Exam5_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		// ���� 0�� �ƴ� �迭����� �հ� ����� ���ϴ� �ڵ� �ۼ�

		// �ε����� 2�� ����� ��쿡�� �� �Է� */
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = i + 10; // 10 12 14 16 18
			}
		}

		int sum = 0;
		int count = 0;
		float avg = 0f;

		// �ڵ��ۼ�
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
			sum+=arr[i];
		    count++;
			}
		}
		avg = (float)sum/count;
		System.out.println("�� : " + sum);
		System.out.println("��� : " + avg);

	}
}

//		for (int j = 0; j < arr.length; j++) {
//			if (arr[j] > 0) {
//				sum = sum + arr[j];
//				count = count + 1;
//			}
//			avg = (float) (sum / count);
//
//		}