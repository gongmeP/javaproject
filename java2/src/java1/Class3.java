package java1;

public class Class3 {

	// 외부 class 생성시 static 유/무 활용 및 return 메소드
	public static void main(String[] args) {

		Box b = new Box();
		b.abc();

		Class3 c3 = new Class3(); // 같은 클래스라도 해당 객체 생성 후 메소드 호출가능
		c3.bbb();

		// event 라는 메소드가 static 메모리에 할당 되어있으므로
		// Coupon 클래스를 로드 후 해당 메소드를 바로 호출가능
		Coupon.event();

		// 리턴 메소드로 값 받기
		String res = c3.zzz();
		System.out.println(res);

		int res2 = c3.kkk();
		System.out.println(res2);

	}

	public void bbb() {
		int a = 10000;
		double b = a / 0.5;
		System.out.println(b);
	}

	// 리턴 메소드(문자 형태)
	public String zzz() {
		String a = "거북선";
		return a;
	}

	// 리턴 메소드 (숫자 형태)
	public int kkk() {
		int a = 100;
		return a;
	}

}

//static 메소드가 있는 경우
class Coupon {
	public static void event() {
		int cp = 30;
		System.out.println(cp);
	}
}

//static 메소드가 없는 경우
class Box {
	public void abc() { // static void : 메모리에 할당되는 메소드
		// static 을 사용하지 않을경우 같은 package 안에서는 공유가 가능함
		System.out.println("test");
	}
}
