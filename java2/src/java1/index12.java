package java1;

import java.math.BigInteger; // BigInteger 클래스 로드

public class index12 {

	//Big_loop 값 설정
	public static void main(String[] args) {
		// 1~100 까지 모든숫자를 곱하여 최종 결과값 출력
		int w = 1;
//		long sum = 1;
		BigInteger sum = new BigInteger("1");
		//BigInteger : java에서 유일하게 무한의 값을 가질 수 있는 자료형 , 변수값에 최초값은 무조건 문자로 설정
		while(w<=100) {
			//add : 사칙연산 더하기 담당 
			//subtract : 뺴기 
			//multiply : 곱하기 
			//divide : 나누기
			sum = sum.multiply(BigInteger.valueOf(w));
			//valueOf 문자를 숫자로 변경
			
			w++;
		}
		System.out.println(sum);

	}

}
