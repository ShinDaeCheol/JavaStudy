package ch01;

public class UnixTime {
public static void main(String[] args) {
	System.out.println(System.currentTimeMillis());
	
	System.out.println("1��"+(int)(Math.random()*6+1));
	
	System.out.println("2��"+(int)(Math.random()*6+1));
	
	System.out.println("�ΰ�����"+((int)(Math.random()*6+1))+(int)(Math.random()*6+1));
	
	int num1 = (int) (Math.random() * 6 + 1);
	System.out.println(
		"1�� " + num1
	);
	
	int num2 = (int) (Math.random() * 6 + 1);
	System.out.println(
		"2�� " + num2
	);
	System.out.println(
		"�ΰ��� ���� " + ( num1 + num2 )
		);
	
	
	
	
	
	}
}
