package java2;

public class Sleep {
//시간 타이머
	public static void main(String[] args) {

		try {
			//Thread 프로레스 작업단위
			int x = 0;

			while (x < 101) {
				Thread.sleep(1000); // 1초에 한번씩 반복하는 형태
				System.out.println(x);
				x++;
			}

		} catch (Exception e) {

		}
	}

}
