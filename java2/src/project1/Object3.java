package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object3 extends ob2{

	//원시배열 값을 Object 배열로 이관하기
	public static void main(String[] args) {
		
		ob2 ob = new ob2();
		ob.data1();

	}

}
class ob2{
	ArrayList<Object[]> al2; // 2차 배열 이상
	Object data2[][]; // 2원시 2차 배열
	//2차 원시 배열 생성시 주의 사항은 Object를 적용 후 사용해야함
	
	public void data1() {
		
		this.data2 = new Object[][] {
			{"hong","kim","park","hong","kang","jang"},
			{2000,5000,4000,2200,3100,4120}
		};
		
		this.al2 = new ArrayList<>(Arrays.asList(this.data2));
		System.out.println(this.al2.get(1)[1]);
		System.out.println(Arrays.toString(this.al2.get(1)));
		
		//해당 배열값 중 평균 총 포인트는 얼마인지 결과값 출력
		//평균 포인트는 : 0원 입니다.
		
		int ea = this.al2.get(1).length;
		
		int x= 0;
		Integer sum =0;
		while(x < ea) { // 데이터 갯수만큼 반복
			sum += (int)this.al2.get(1)[x]; // 전체 금액 모두 더함 
			x++;
		}
//		System.out.println(sum);
		System.out.println(sum/ea);
	}
}
