package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문 사용
		
		int f;
		for (f=1; f<=10; f++) {
//			System.out.println(f);
		}
		
		//더블 for 문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
//				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		//45 ~ 60 까지 총합산한 결과값을 출력하시오
		
		int x;
		int sums = 0;
		for(x=45; x<=60; x++) {
//			System.out.println(x);
			sums += x;
		}
		System.out.println(sums);
		
		//1~200 숫자중 홀수값만 모두 더한 결과값을 출력
		
		int xx;
		int sum2 = 0;
		for(xx=1;xx<=200;xx++){
			if(xx % 2 != 0) {
				sum2 += xx;
			}
			
		}
		System.out.println(sum2);
		
		
		// 20 ~ 60 중 3의 배수 값을 더한 후 짝수인지 홀수인지 출력
		
		int xxx;
		int sum3 = 0;
		for(xxx=20;xxx<=60;xxx++) {
		
			if(xxx % 3 == 0) {
				sum3 +=xxx; 
					
				}
				
			}
		System.out.println(sum3);
		if(sum3 != 0) {
			System.out.println("홀수입니다.");
		}else if (sum3 == 0) {
			System.out.println("짝수입니다.");
			
		}
		
		// 7단 ~ 3단 역순출력 
		// 결과값이 홀수 인 값만 출력됩니다.
		
		int y;
		int yy;
		int ysum;
		for(y=7; y>=3; y--) {
			
		for(yy=9; yy>=1; yy--) {
			ysum = yy*y;
			System.out.println(ysum);
					
		}
		}
		
		
	}

}
 