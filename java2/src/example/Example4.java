package example;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner; // 라이브러리 호출
//라이브러리란 ? 소프트웨어 개발시 부가적인 옵션의 모임

public class Example4 {
	Scanner sc = new Scanner(System.in);
	Date today = new Date();
	SimpleDateFormat sim = new SimpleDateFormat("yyyy.MM.dd");
	SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
//	Arrays ar = new Arrays();

	public static void main(String[] args) {
		Example4 ex = new Example4();
		ex.print();

	}

	public void print() {
		System.out.println(today);
		System.out.println(sim.format(today));
		System.out.println(time.format(today));
	}
}
