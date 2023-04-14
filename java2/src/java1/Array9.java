package java1;

public class Array9 {
//2차 배열 구조 및 출력
	// 동적배열 : int a[] = {1,2,3};
//	          : int[] a = {1,2,3};
//	          : int[] a = new int[] {1,2,3};

	// 정적배열 : int a[] = new int[2];
//	             a[0]=1;
//	             a[1]=2;

//	a1 = 10,20,30 동적전달
//	a1 =10&a2=20&..		정적전달
	public static void main(String[] args) {

		String member[][] = { { "홍길동", "김유신", "유관순" }, { "25", "31", "22" } };
//		System.out.println(Arrays.toString(member[1]));
//		System.out.println(member[0][2]);

		int x = 0;
		while (x < member.length) {

			int y = 0;
			while (y < member[0].length) {
				System.out.println(member[x][y]);
				y++;
			}
			x++;
		}
	}

}
