package Files;

import java.io.OutputStream;
import java.util.Arrays;

//OutputStream : 출력 담당
// - FileOutputStream, ObjectOutputStream, AudioOutputStream
public class File11 {

	public static void main(String[] args) {
		try {
			load l = new load();
			l.output();
		}catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}

}

class load {
	OutputStream os = null; // Output자체가 sysout 을 사용안함
	public void output() throws Exception{
		String data = "abcde";
		//byte[] : 문자열을 ASCII코드 형태의 배열로 변경하는 것을 말함
		byte[] ba = data.getBytes(); // getBytes : 문자를 숫자형태로 변환
		System.out.println(Arrays.toString(ba));
		this.os = System.out;
		this.os.write(ba,0,ba.length); //write(배열변수,시작값,종료값) / 배열변수. 시작 0에서 배열의 갯수 까지출력
		this.os.flush();//byte 단위의 배열값을 역으로 해석해서 문자화 시킴
		//flush : 메모리를 깨끗하게 비워줌
		
	}
}
