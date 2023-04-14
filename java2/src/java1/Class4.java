package java1;

public class Class4 {

	// 응용4
	// static이 없는 외부class 이며 해당 class의 두개의 숫자를 인자값으로 받음
	// 두개의 숫자 범위 안에 모든 값을 더하여 결과값 받아서 출력 / 리턴 메소드 필수
	public static void main(String[] args) {

		Xyz plus = new Xyz(); // 외부 클래스 객체 생성
		int sum = plus.abc(10, 20); // 해당 클래스에 인자값 전달 및 return
		System.out.println(sum);
	}

}

class Xyz {

	public int abc(int x, int y) {
		int z = 0;
		while (x <= y) {
			z = z + x;
			x++;
		}
		return z;
	}
}
