package ch04;

public class If {
	public static void main(String[] args) {
		// �ּ�ó�� ����������(����Ʈ+�巡��)�� ��Ʈ��+/
		int score = 66;// �������� 87
		if (score >= 90) {
			System.out.println("A");
		} else if (score <90&& score >= 80) //�̷��� �����ϰ��ִ� 
			{
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	
}
}
