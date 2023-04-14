package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 b = new gugudan2();
		b.gugu();

	}

}

class gugudan {
	protected int number;

	Scanner sc = new Scanner(System.in);
	void gugu() {
		System.out.println("검색할 구구단을 입력하세요.");
		
	}

	public void result(int number) {

	}

}

class gugudan2 extends gugudan {
	@Override
	void gugu() {
		super.gugu();
		this.number = sc.nextInt();
		sc.close();
		result(this.number);

	}

	@Override
	public void result(int number) {

		super.result(number);
		
		int x = 1;
		int sum = 0;
		while (x <= 9) {
			
			sum = number * x;
			System.out.printf("%d * %d = %d \n",number,x,sum);
			x++;
		}
		
		

	}

}