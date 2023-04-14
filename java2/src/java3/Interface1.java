package java3;

public class Interface1 {
//interface 사용법(inter1.java, inter2.java 연계)
	//interface 특징 : class가 없음 (추상 메소드)
	public static void main(String[] args) {
	
		key k = new key();

		k.z1();
		k.z2();
	}

}

//Interface 상속을 받기 위해서는 implements를 사용 (extends 사용안함)
//Interface는 부품이며, 해당 부품을 조힙하여 프로그램을 완성하는 형태
//여러개의 interface를 한번에 모두 로드가능

//Interface의 단점 : 일반 메소드를 생성하지 못함 , 강제로 메소드 생성가능(default 이용시)

//동일한 변수를 사용시 this를 사용하지 못하며 , 해당 interface 메소드 이름을 입력후 변수 사용
class key implements inter1,inter2{
	@Override
	public void z1() {
		
		System.out.println(inter1.names);
		//인터페이스이름.변수명
		
	}
	
	@Override
	public void z2() {
	System.out.println(inter2.names);
		
	}
	@Override
	public String z3() {
	
		return null;
	}
	
	@Override // 사용자유 / default로 생성한 일반메소드 오버라이드
	public void z1_1(int a, int b) {
		
		inter1.super.z1_1(a, b);
	}
	
	
}