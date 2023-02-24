package ch01;

public class MainTest1 {
	public static void main(String[] args) {
		// 복합 대입 연산자
		// 다른 연산자와 대입연산자를 함께 사용하는것

		// 1.
		int num1 = 1;
		num1 = num1 + 10;
		System.out.println(num1);

		// 2.
		int num2 = 1;
		num2 += 10;
		System.out.println(num2); // 1번을 간소화한것

		// 3.
		int num3 = 1;
		num3 -= 10;
		System.out.println(num3); // 1번을 간소화한것 & (-)연산자를 사용

		// 문제 복합 대입 연산자로 변경해 주세요
		num1 = num1 * 2;
		num1 *= num1;

		num2 = num2 / 2;
		num2 /= num2;

		num3 = num3 % 2;
		num3 %= num3;

	}// end of main
}// end of class
