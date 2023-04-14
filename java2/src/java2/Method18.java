package java2;

public class Method18 extends data {

	public static void main(String[] args) {

		md m = new md();
		m.display();

		Method18 m1 = new Method18();
		m1.name();

	}

	@Override // 상속받는거 (오버라이딩)
	void name() {
		super.name();
		System.out.println("123123"); // 없는코드 추가 오버로딩
	}

}

class md extends pt {
	@Override
	void display() {

		super.display();
	}
}

class data {
	void name() {
		System.out.println("외부 클래스 data 로드");
	}
}


//Main class 에서는 Main class 상속불가
// 다른파일에 있는 외부 class 를 실행 시키고자 하는 파일에서 상속할수있음
// main class 에서 외부 class 를 상속가능.