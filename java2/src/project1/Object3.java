package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object3 {

	//원시배열 값을 Object 배열로 이관하기
	public static void main(String[] args) {
		
		ob1 ob = new ob1();
		ob.data1();

	}

}
class ob1{
	ArrayList<Object> al; // 2차 배열 이상
	Object data[][]; // 2원시 2차 배열
	//2차 원시 배열 생성시 주의 사항은 Object를 적용 후 사용해야함
	
	public void data1() {
		
		this.data = new Object[][] {
			{"hong","kim","park","hong","kang","jang"},
			{2000,5000,4000,2200,3100,4120}
		};
		
		this.al = new ArrayList<>(Arrays.asList(this.data));
		System.out.println(Arrays.toString(this.al.get(0)));
		
		//해당 배열값 중 평균 총 포인트는 얼마인지 결과값 출력
		//평균 포인트는 : 0원 입니다.
	}
}
