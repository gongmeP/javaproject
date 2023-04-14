package java2;

//클래스 안에 클래스
public class Method16 {

	public static void main(String[] args) {

		green g = new green(); // 부모 클래스 인스턴스 생성
		g.setter(10, 20);
		green.blue gb = g.new blue(); // 부모 클래스 안에 자식 클래스 인스턴스 생성
		gb.print();// 자식 클래스 메소드 호출
	}

}

class green { // 부모 class
	int aa, bb;
	String name = "홍길동";

	public void setter(int a, int b) {
		
		this.aa = a;
		this.bb = b;
		
		blue ab = new blue(); // 자식 클래스 호출
		System.out.println(ab.age); 
	}


	class blue { // 자식 class
		int a1 = green.this.aa; // 해당 필드에 class 변수를 this 사용해서 선언해야함
		int b1 = green.this.bb;
		String age = "30";

		public void print() {

			System.out.println(green.this.name);
			System.out.println(a1 * b1);

		}

	}
}