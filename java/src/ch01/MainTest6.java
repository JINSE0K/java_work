package ch01;

public class MainTest6 {
	public static void main(String[] args) {
		//논리연산자 ( &&, ||) & < 앰퍼샌드라고 불림, | < 버티컬바 라고 불림
		// && 논리곱, || 논리합, ! < 부정 
		//연산의 결과값은 참,거짓으로 불리언타입으로 나온다
		//보통은 비교연산자와 많이 사용을 함
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		boolean flag2 = (num1 < 0) && (num2 > 0);
		//논리곱 && 에서는 두개의 비교구문에서 두개다 참일경우에만 true(참)을 반환함
		// false && true = false;
		// true && false = false;
		System.out.println(flag1);
		System.out.println(flag2);
		//=====================================
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		//논리합 || 에서는 두개의 비교구문에서 하나만 참이면 true(참)을 반환해줌
		
		boolean flag4 = (num1 > 0) || (num2 > 0);
		System.out.println(flag4);
		
		
		
		
		//==============================
		//결론 논리곱 &&에서는 하나라도 거짓이 있으면 거짓을 반환함
		//    논리합 ||에서는 하나라도 참이 있으면 참을 반환함
		
		
		
		
		
	}
}
