package project1;

public class Example2 {

	public static void main(String[] args) {
		// 추상 클래스를 사용하게 되면, 빠르게 객체를 로드할 수 있습니다.
		// 추상 클래스명으로 배열을 생성하여
		// new 메소드명으로 전체를 등록시킴
		
		box[] b = {new abox(), new abox2(), new abox3()};
//		b[0].dataload();
//		b[1].dataload();
//		b[2].dataload();
		//각각 로드하는 법
		
		int w= 0;
		//반복문으로 로드 
		while(w < b.length) {
			if (w !=1) {//배열값중 인덱스 1번 제외하고 나머지 로드
				
				b[w].dataload();
			}
			w++;
		}

	}

}

abstract class box{
	public abstract void dataload();
	
}

class abox extends box{
	@Override
	public void dataload() {
		
		System.out.println("1번 데이터 로드");
		
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		
		System.out.println("2번 데이터 로드");
		
	}
}

class abox3 extends box{
	@Override
	public void dataload() {
		
		System.out.println("3번 데이터 로드");
		
	}
}