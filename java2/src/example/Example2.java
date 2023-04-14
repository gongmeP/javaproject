package example;

public class Example2 {
	final int data1 = 20; // final 상수 . 값을 변경 못함
	String abc = "홍길동";

	public static void main(String[] args) {

		final int data2 = 50; // 메소드 안에 상수 선언
		System.out.println(data2);

//		System.out.println(ex.data1); // field에 있는 값을 main 에서는 직접 핸들링 불가

		Example2 ex = new Example2(); // 객체 생성 및 인스턴스로 등록하면 main 에서 핸들링 가능
		System.out.println(ex.data1);
		ex.abc = "이순신";
		ex.aaa();
	}

	public void aaa() { // 확장 메소드에서는 field에 있는 값을 핸들링 가능
		this.abc = "강감찬";
		System.out.println(this.abc);
		System.out.println(data1);

	}

}
