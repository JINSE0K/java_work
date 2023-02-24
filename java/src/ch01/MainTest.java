package ch01;

public class MainTest {
	public static void main(String[] args) {
		char myA = 'A';
		char yourB = 'a';
		System.out.println((int)myA); // 문자를 강제로 int 타입으로 변환 'A'를 int로 변환시 65로 출력
		System.out.println((int)yourB); // 결과값 97로 나옴
		System.out.println("==========");
		System.out.println((short)myA); // short타입으로도 가능함 근데 걍 int타입으로 사용하면됌
		
		//대입연산자 ( = ), 연산의 방향은 오른쪽에서 왼쪽으로 연산이 된다.
		int number = 10;
		//변수에 변수를 대입할 수 있다.
		int number2 = number;
		System.out.println(number2);
		//부호연산자
		System.out.println(-number2); // 변수명 앞 - + 등 넣는걸 말함
		// 본래 변수값이 변경되는것은 아님 예를 들어 본디 변수가 -10이고 sysout에 -붙혀 넣으면
		// -(-10)이 되는꼴 그럼 +10이 되서 10이 출력이됌 계산은 된다는말

		
		
		
		
	}
}
