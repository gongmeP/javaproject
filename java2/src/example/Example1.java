package example; // 그룹에 해당

class korea { // 외부 class
	// 외부 Field 공간

//	public void abc() { // 외부 메소드
	void abc() { // 기본 public 생략 가능

	}
}

public class Example1 { // class는 무조건 생성
	// Field공간 *전역변수 (private,public,protected,default)
	private int a = 1;
	public int b = 2;
	public String c = "이순신";
	String aa = "3";
	protected int d = 3;

	public Example1() { // construct 즉시실행

	}

	public static void main(String[] args) { // 프로세스 실행 메인 메소드

		// main 메소드는 1개로 구성

	}

	public String abc() { // 문자형 리턴 메소드 void 안씀

		return null;
	}

	public void bbb() { // 일반 확장 메소드

		String a = "홍길동"; // 지역변수
	}

	public static void ccc() { // 메모리에 저장시키는 일반 확장 메소드

	}

}
