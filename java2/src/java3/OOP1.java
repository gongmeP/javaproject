package java3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1 {

	// List, ArrayList, LinkedList, Map(Key)
	public static void main(String[] args) {

		// 응용문제1 사용자가 입금을 처리하게됩니다
		// 8번의 횟수 금액 입력 , 모두 입금이 완료되면 최종 합계 금액을 출력시키는 프로세스 구축

	   
		LinkedList<Integer> als = new LinkedList<>();
		Integer sum = 0;
		Scanner sc;

		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.println("입금할 금액을 적으세요");
				Integer mey = sc.nextInt();
				als.add(mey);
				sum = sum + mey;
				Integer cnt = als.size();
				if (cnt == 8) {
					break;
				}

			}
			catch (Exception e) {
				System.out.println("숫자만");
				continue;
			}
		}

		DecimalFormat com = new DecimalFormat("###,###");
		System.out.printf("최종 입금 금액 : " + com.format(sum) + "원");
		sc.close();

//		System.out.println(als);

	}

}
