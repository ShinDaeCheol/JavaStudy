package ch06;

//�޼ҵ� ���� ��Ģ
//�ݵ�� Ŭ���� ���� ǥ���Ǿ���Ѵ�.
//�޼ҵ� ���� ǥ���Ҽ� ����.
//��ġ �������.
public class MethodTest2 {
	private static final String sum = null;

	public static boolean hasNegative(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<0) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,-9};
		boolean b = hasNegative(arr);
		System.out.println(b);
		//�� �迭�� ������ �ִ��� �˻�
	}

	double avg = average(sum);

	private double average(String sum2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
