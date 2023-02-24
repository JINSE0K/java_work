package ch01;

public class Datatype2 {
	public static void main(String[] args) {
		// 데이터 타입의 종류는 크게 두가지
		// 1. 기본데이터 타입 (primitive data type)
		// 2. 참조 타입(Reference type)

		byte b;
		short s;
		int i;
		long l;

		b = 127; // 바이트 타입은 127부터 -128까지 담을수있음
		b = -128;
		b = 128; // < 안됌

		s = 32767; // 쇼트 타입은 32767 , -32767까지 담을수 있음
		s = 32768; // 안됌

		// ================바이트와 숏타입은 쓰임이 적음====================

		i = 2100000000;
		i = -2100000000; // 인트는 21 ~ -21억 까지 쓸수있음
		// 제일 많이 사용함

		l = 21000000000; // 롱 타입은 int 보다 높은 단위수를 쓸때 사용
		l = 21000000000L; // 그리고 숫자뒤 소,대문자 'L' 접미사(?) 붙여줘야 사용가능
		
		

	}// end of main
}// end of class
