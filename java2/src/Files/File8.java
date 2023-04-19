package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.nio.Buffer;
import java.nio.charset.Charset;

public class File8 {

	public static void main(String[] args) throws Exception {
		// BufferReader (output) - cpu 캐시 메모리 임시저장
       // 사용이유 : 배열에 값을 빠르게 배분하여 활용 할 수 있도록 함
		buffer bf = new buffer();
		bf.dataview();

	}

}

class buffer {
	FileReader fr = null;
	FileReader fr2 = null;
	BufferedReader br = null;

	public void dataview() throws Exception {
		this.fr = new FileReader("E:\\pjk\\java1\\src\\Files\\notice.txt");
		this.br = new BufferedReader(this.fr);

		// FileReader를 한번 사용했으면 다시 선언해야함 / 두번 인식이 안됨
		// 파일 객체를 한번 인스턴스로 로드함
		this.fr2 = new FileReader("E:\\pjk\\java1\\src\\Files\\notice.txt");
		//LineNumberReader : 새롭게 생선된 객체 인스턴스를 로드합니다.
		LineNumberReader li = new LineNumberReader(this.fr2);
		System.out.println(li.getLineNumber());

		int ea = 0;
		while (li.readLine() != null) {
			ea = li.getLineNumber();
		}
		// 조건문에 BufferedReader 의 readLine 사용시 해당 데이터의 첫번째 라인은 조건문으로 사용해버려서 삭제되버림
		// 첫번째 라인은 캐시 메모리에서 삭제
		// **** Buffer는 무조건 한번 사용시 다음 라인으로 이동 됩니다.
//		if(this.br.readLine()!=null) {
//			
//			System.out.println(this.br.readLine());
//		}

		// String 자료형 하나 만들어서 받아서 사용함
		String text = "";
		while ((text = this.br.readLine()) != null) {
			System.out.println(text);
		}

//		while(true) {
//			String text = this.br.readLine();
//			System.out.println(text);
//		}

	}
}