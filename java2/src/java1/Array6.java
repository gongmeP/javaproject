package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
//배열 키오스크 응용
	public static void main(String[] args) {
		// 주문하고자 하는 음식을 선택해주세요
		// 사용자가 원하는 음식을 선택 후 리스트 출력
		// 주문 종료를 선택했을경우에만 주문한 음식 리스트가 출력
		// 1. 햄버거 2. 피자 ~ 7. 주문종료
		// 주문하고자 하는 음식을 선택해주세요.
		// [치킨,라면,햄버거]
//
//		Scanner sc = new Scanner(System.in);
//		int w = 1;
//		while (w <= 5) {
//			System.out.println("선택하세요.");
//			int select = sc.nextInt();
//			if (select == 0) { // 사용자가 해당 숫자를 입력하면 조건문 발동
//				System.out.println("종료");
//				break; // 반복문 강제종료
//			}
//			w++;
//		}
//		sc.close();

		// 주문하고자 하는 음식을 선택해주세요
		// 사용자가 원하는 음식을 선택 후 리스트 출력
		// 주문 종료를 선택했을경우에만 주문한 음식 리스트가 출력
		// 1. 햄버거 2. 피자 ~ 7. 주문종료
		// 주문하고자 하는 음식을 선택해주세요.
		// [치킨,라면,햄버거]
		String menudata[] = { "햄버거", "피자", "치킨", "라면", "김밥", "커피" };
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료");

		int ea = menudata.length;
		int x = 0;
		String sel[] = new String[ea]; // 사용자가 입력시키기 위한 빈배열 변수
		while (x <= ea) {
			System.out.println("\n주문하고자 하는 음식을 선택해주세요");
			int select = sc1.nextInt();
//			Intger.parseInt : 문자를 숫자로 변경
//			if (select < ea) {
//
//				System.out.print(menudata[select - 1]);
//				sel[x] = menudata[select - 1];
//			}

			if (select == 7) {
				System.out.printf("메뉴 : ");
				System.out.println(Arrays.toString(sel));
				break;
			} else {
				System.out.print(menudata[select - 1]);
				sel[x] = menudata[select - 1];
			}
			x++;
		}
		sc1.close();

	}

}
