package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {

	Scanner sc = new Scanner(System.in);

	// 응용문제4
	// 자판기 프로세스 개발 다음과 같이 작동 되도록 코드를 작성
	// "금액을 입력하세요 : "
	// "다음메뉴를 선택하세요[콜라,사이다,환타,포카리]"
	// "최종 남은 금액은 xxx 얼마 입니다."

	String data[][] = { { "콜라", "사이다", "환타", "포카리" }, { "500", "500", "600", "800" } };

	public static void main(String[] args) {

		Example9 x = new Example9();
		x.ab();

	}

	void ab() {
		System.out.printf("금액을 입력하세요. : ");
		Integer y = sc.nextInt();
		System.out.printf("다음 메뉴를 선택하세요. %s",Arrays.toString(data[0]));
		String ytext = sc.next();
		
		int x= 0;
		int ea = data[0].length;
		int z ;
		int sum = 0;
		while(x < ea ) {
			
			if(ytext.equals(data[0][x])) {
				
				z = Integer.valueOf(data[1][x]);
			
				 sum = y - z ;
			}
			x++;
			
		}
		if(sum <= 0) {
			System.out.println("금액이 모자릅니다.");
		}
		else {
			
			System.out.printf("최종 남은 금액은 %d 입니다.",sum);
		}
		
		
		
	}

}
