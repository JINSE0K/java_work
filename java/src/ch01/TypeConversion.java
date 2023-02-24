package ch01;

public class TypeConversion {
	public static void main(String[] args) {
		//형변환
		//자동 형 변환
		//강제 형 변환
		int iNumber1 = 100;
		System.out.println(iNumber1);
		
		//자동 형변환
		double jNumber1 = iNumber1; //더블은 소숫점
		System.out.println(jNumber1);
		
		//강제 형변환 문제 만들어보기
		double iNumber2 = 235.56874;
		int jNumber2 = (int)iNumber2;
		System.out.println(jNumber2);
		//-----------------------
		
		//강제형변환
		//강제 형변환의 주의점
		double dNumber2 = 0.0012345;
		int iNumber3 = (int)dNumber2; //작성자가 컴파일러한테 강제함
		System.out.println(iNumber3);
		
		int iNumber4 = (int)10.95;
		System.out.println(iNumber4); //강제 형 변환 시 자료형크기에 맞춰서 삭제됌
		// 결과값 10이 나옴
		
		double a; 
		int b; 
		
		// 1. a 에 값 0.5를 담아 보세요
			a = 0.5; 
		// 2. b에 값 10.5 리터럴값을 담아 보세요
			
			b = 10.5; // int는 정수형이라서 안됌
			b = (int)10.6; // 강제형변환을 통해 입력가능 (int)
		// 강제 형변환시 데이터 손실이 생긴다
			System.out.println(a);
			System.out.println(b);
		
		
		
		
		
	}//end of main
}//end of class
