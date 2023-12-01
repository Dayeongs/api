package enum1;

public class App3 {
	
	public static void main(String[] args) {
		// 열거객체를 획득하는 2가지 방법

		// 열거상수를 통해 열거객체 획득
		Grade grade1 = Grade.GOLD;
		
		System.out.println("열거객체의 상수명: " + grade1.name());
		System.out.println("열거객체의 고유한 값1[등급명]: " + grade1.getName());
		System.out.println("열거객체의 고유한 값2[적립률]: " + grade1.getDepositRate());
		
		// 문자열로 열거객체 획득
		Grade grade2 = Grade.valueOf("GOLD");
		
		System.out.println("열거객체의 상수명: " + grade2.name());
		System.out.println("열거객체의 고유한 값1[등급명]: " + grade2.getName());
		System.out.println("열거객체의 고유한 값2[적립률]: " + grade2.getDepositRate());
		
	}

}
