package java2;

public class Method14 {
//Object 클래스
	public static void main(String[] args) {

		test1 t = new test1();
		t.info("홍길동", 30);
		System.out.println(t.equals(30));

		boolean result = t.equals(30);
		if (result == false) {
			System.out.println("숫자로 입력하세요");

		} else if (result == true) {
			System.out.println("올바른 값 입니다.");
		}

	}

}

class test1 extends Object {
	private String name;
	private int age;

	public void info(String n, int a) {
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override // 오버라이드시 인자값 자료형 및 인자값 추가를 하지못함(본 class에 메소드를 수정해야함)
	public boolean equals(int z) { // boolean 숫자가 아닌 문자로 들어올 경우

		return super.equals(z); // 문자일 경우 false 반환
	}

}

class Object {
	public String toString() { // 객체를 문자열로 정의하여 간단하게 내용을 확인

		return null;
	}

	public boolean equals(int z) { // 같은 class 의 값을 비교하는 메소드

		return true; // 기본 true(숫자로 들어올 경우는 true 로 반환)
	}

}
