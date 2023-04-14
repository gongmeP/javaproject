package java1;

class Member{ // 외부 클래스
	String user = "홍길동";  // 인스턴스 변수값
	
	public static void eq(int x, int y) {
		
		int z = x*y;
		if(z % 2 ==0) {
			System.out.println("짝수 입니다.");
			System.out.println(z);
		}
		else if(z % 2 !=0 ) {
			System.out.println("홀수 입니다.");
			System.out.println(z);
		}
		
		
	}
	
	public static void abc() { // void : return 이 없는 메소드
		String user2 = "이순신";
		System.out.println(user2);
		
	}
}

// [접근 제어자]
// public : 기본으로 필요시 잡근이 용의하게 사용 (접근 제한이 없음)
// private : 자신의 클래스 내에서만 접근이 됨 (같은 패키지 아니여도 됨)
// protected : 같은 패키지 안에서 파생되는 클래스만 접근이됨
// 외부 클래스 : default (동일한 패키지만 접근이 됨ㄴ)
public class Class2 {
	//외부 Class 및 외부 메소드 활용

	
	public static void main(String[] args) {
	Member m = new Member(); // 객체생성
	System.out.println(m.user);
	m.abc(); //Member Class 에 abc 메소드를 실행
	
	Inject i = new Inject();
	i.user("hong", "a123456"); // 인자값으로 해당 메소드 전송

	//응용문제1 외부 class 를 이용하여 2개의 숫자값을 매소드를 이용하여 곱하고 짝 인지 홀인지 검토
		
	Member eqq = new Member();
	eqq.eq(50,30);
	
	
	
	
	}
	
	

}

class Inject{
	// user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public static void user(String name,String pw) {
		System.out.println("사용자명 : "+name+"\n패스워드 : "+pw);
	}
	
	
}
