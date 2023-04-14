package java3;

import java.util.Arrays;

public class Abstract4 {
//1차 배열값이 있습니다
	// 해당 배열값 리스트를 오름차순으로 정렬하고 해당 배열값을 더한 최종 결과값 출력
	public static void main(String[] args) {
	
		Abst4 totals = new Abst4();
		
		totals.datalist();
		totals.result();

	}

}

class Abst4 extends sum_total{
	int datas[] = null;
	@Override
	public void datalist() {
		datas = new int[] {1,10,15,19,8,4,7,0,2,3,9,12};
			
		Arrays.sort(datas);
		System.out.println(Arrays.toString(datas));
		
	}@Override
	public void result() {
		this.sum = 0;
		int x = 0;
		int ea = datas.length;
		while(x < ea) {
			
			this.sum += datas[x];
			x++;
		}
		System.out.println(this.sum);
		
	
		
	}
}
