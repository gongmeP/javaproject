package java1;

public class Array2 {

	// 메소드로 배열값 전달하는 방식 (1차배열)
	public static void main(String[] args) {
		String user[] = { "hong", "kim", "park" };
		Array2 ar = new Array2();
		ar.abc(user); // abc 메소드로 배열값을 전달

	}

	public void abc(String a[]) { // 배열 형태의 인자값을 받음
		int ea = a.length;
		System.out.println(ea);
		System.out.println(a[0]);
	}

}
