package java1;

import java.util.Scanner;

public class index14 {

	//할인율 구하는 공식 방법
	public static void main(String[] args) {
		int money = 10000;
		int coupon = 20;
		double a = coupon *0.01;
		double b = money * a ; 
		double c = money - b;
		
		//int 란 double 자료형 변환 시킬떄 사용
		int total = (int)Math.round(c);
		
//		double sum = money-(money*(coupon * 0.01));
		
//		System.out.println(total);
		
//		응용문제4
		// 총 상품 금액이 50000원 입니다. 
		// 사용자에게 "할인 쿠폰을 얼마를 적용 할까요" 라는 질문과 함께 숫자를 받습니다.
		//결과값으로 사용자가 적용한 할인율을 최종 상품금액으로 출력하시오
		// 총 삼품금액 50000원 할인쿠폰을 얼마를 적용할까요
		//20
		//최종 상품금액은 40000원 입니다.
		
		int money1 = 50000;
		Scanner coupon1 = new Scanner(System.in);
		System.out.println("할인 쿠폰을 얼마를 적용 할까요");
		int sl = coupon1.nextInt();
		
		double a1 = sl*0.01;
//		System.out.println(a1);
		double b1 = money1*a1;
		double c1 = money1 - b1;
		
		int total2 = (int)Math.round(c1);
		
		System.out.printf("최종상품 금액은 %d 원 입니다.",total2);
		coupon1.close();
	
		
		
	
		
	}

}
