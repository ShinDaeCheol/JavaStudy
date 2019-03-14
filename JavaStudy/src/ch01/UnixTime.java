package ch01;

public class UnixTime {
public static void main(String[] args) {
	System.out.println(System.currentTimeMillis());
	
	System.out.println("1번"+(int)(Math.random()*6+1));
	
	System.out.println("2번"+(int)(Math.random()*6+1));
	
	System.out.println("두개의합"+((int)(Math.random()*6+1))+(int)(Math.random()*6+1));
	
	int num1 = (int) (Math.random() * 6 + 1);
	System.out.println(
		"1번 " + num1
	);
	
	int num2 = (int) (Math.random() * 6 + 1);
	System.out.println(
		"2번 " + num2
	);
	System.out.println(
		"두개의 합은 " + ( num1 + num2 )
		);
	
	
	
	
	
	}
}
