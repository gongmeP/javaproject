package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		//응용문제7
		//사용자가 숫자 세개를 입력 시킵니다.
		//3개의 숫자중 짝수의 대한 숫자만 곱하여 결과값을 출력합니다
		// 짝수의 숫자가 1개 또는 없을 경우 "짝수의 숫자가 확인되지 않습니다." 
		
		int x = 1;
		int sum =1;
		int sum2;
		int cnt = 0;
		Scanner num = new Scanner(System.in);
		while(x<=3){
			System.out.println("짝수 를 입력해주세요.");
			int a = num.nextInt();
			
			if(a % 2 == 0) {
				sum = sum*a;
				cnt++;
			}
						
			x++;
			num.close();
			}
		if(cnt == 0 || cnt == 1) {
			System.out.println("짝수가 확인되지 않습니다.");
		}else {
			
			sum2 = sum;
			System.out.println(sum2);
		}
			
			
		}
		
	
		

	}


