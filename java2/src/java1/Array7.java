package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// 응용문제6
//		사용자가 상품을 검색하고 해당 내용이 배열로 저장되도록 하세요.
//	    상품검색 : 선풍기
//		상품검색 : 모니터 
//      상품검색 : 검색종료    > [선풍기,모니터,null ... 7개]

		Scanner scA = new Scanner(System.in);
		int x = 0;
		String data[] = new String[7];
		while (x <= 7) {
			System.out.print("상품검색 : ");
			String seh = scA.nextLine().intern();
			// 검색어에 공백이 있을수도 있기때문에 nextLine 씀.
			if (seh == "검색종료") {

				break;
			} else {

				data[x] = seh;
//				data[x] = scA.nextLine().intern();
				// 바로 입력 가능.
			}
			x++;
		}
		System.out.println(Arrays.toString(data));
//		Arrays.toString : 숫자,문자,소수 배열 변수값을 출력하는 함수
		scA.close();

	}

}
