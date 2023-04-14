package java3;



//main class가 없어야함
public abstract class ab1 {
	
	public int aa1 = 30;
	public abstract String loginck();
	public abstract void idck(String id);
	
	public abstract void result();
	public void ab_1 () {
		//추상 클래스의 실제 메소드
	}

}





//abstract3
//외부 가상 class를 만들기위해서는 public를 사용하지 않음
abstract class aa{
	public abstract int password(); //가상 메소드 생성
}

abstract class aa2 extends aa{// 추상 클래스끼리 상속받음
	//추상 클래스는 오버라이드 하지 않음
	public abstract String user_info();
	
}


class aa3{
//일반 클래스 메소드
	public int aa3_method() {
		
		return 0;
		
	}
}






//abstract4
abstract class sum_total{
	public int sum;
	public abstract void datalist();
	public abstract void result();
	
}






