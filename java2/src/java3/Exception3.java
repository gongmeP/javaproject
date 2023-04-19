package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		String data[] = {"2,000","2,500","3,000","500","4,500"};

		method2 mt = new method2();
		try {
			
			mt.total1_method(data);
		}catch (Exception e) {
			System.out.println("해당 데이터는 문자여서 합산이 안됨");
		}
		finally {
			//원시 배열로 받을 경우 원시 배열값으로 보내야함
			//ArrayList, LinkedList , Map 할 경우 못받음
//			ArrayList<String> redata = new ArrayList<>();
			
			String redata[] = new String[data.length];
			int x= 0;
			while(x < data.length) {
				redata[x] = data[x].replaceAll(",", "");
				x++;
			}
			System.out.println(redata);
			
			//다시 해당 메소드를 호출시킴
			try {
				mt.total1_method(redata);
			}catch (Exception e) {
				//catch 에는 sysout을 사용안함
			      e.getMessage(); // 문제 발생시에만 출력됨
			}
			
			
		}
	}

}

class method2 {
	public void total1_method(String[] db) throws Exception{
		System.out.println(Arrays.toString(db));
		int w = 0;
		int ea = db.length;
		int sum = 0;
		
		while(w < ea ) {

			sum += Integer.valueOf(db[w]);
			w++;
		}
		System.out.println("총 합계는" + sum);
		Exception ex = new Exception();
		throw ex;
	
		
	}
}
