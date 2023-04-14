package java1;

import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		
		//System.in(입력) 
		//System.out(출력)
		//new : 객체를 선언하는것을 말함

		Scanner sc = new Scanner (System.in); // 사용자가 직접 값을 입력하는 도구틀
		int a = 10; // 비교 숫자
		
		//print, printf : 같은 라인에 출력
		//println : 다음라인 출력 (br)
		
		System.out.println("사용자가 원하는 숫자를 입력하세요");
		
		int b = sc.nextInt(); // 사용자 입력값을 숫자로 받음
//		String b = sc.next(); // 사용자 입력값을 문자로 받음
		System.out.println(b);
		
		if(a > b) {
			System.out.println("업");
		}
		else if (a < b) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답 입니다.");
		}
		
		sc.close(); //Scanner를 사용후 종료선언
		
	}

}
