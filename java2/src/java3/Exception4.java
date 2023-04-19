package java3;

import java.util.Arrays;

//예외처리 응용
//전체 포인트 합계를 출력하는 프로레스 구축
public class Exception4 {

	public static void main(String[] args) {
		String data[] = { "hong3000", "park1250", "kang852", "kim1819", "lee5117" };
		retry abc = new retry();

		try {
			
			abc.retrys(data);
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				
				System.out.println(e);
			}
		} finally {

			String redata[] = new String[data.length];
			int x = 0;
			while (x < data.length) {

				redata[x] = data[x].replaceAll("[a-zA-z]", "");
				x++;
			}

			try {
				abc.retrys(redata);
			} catch (Exception e) {

				if(e.getMessage()!=null) {
					
					System.out.println(e);
				}
			}

		}

	}

}

class retry {
	public void retrys(String[] datas) throws Exception {
		System.out.println(Arrays.toString(datas));
		int y = 0;
		int sum = 0;
		while (y < datas.length) { 
			//ArrayList (원시배열도 됨) 에서는 숫자로 변환시 (String) 자료형 적용 후 Integer.valueOf, ParseInt 사용
			//valueOf 는 String 자료형 넣어주고 parseInt는 자료형 없이 사용가능
			sum += Integer.valueOf((String)datas[y]);

			y++;

		}
		System.out.printf("총 합계는 %d 입니다.", sum);
		Exception e = new Exception();
		throw e;

	}
}
