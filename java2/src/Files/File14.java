package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class File14 {

	// 1.InputStream > FileInputStream (파일 경로) - 불러오기
	// 2. byte[] 배열 크기 선언
	// 3. read로 파일을 읽어옴
	// 4. 출력

	// 1. OutputStream > FileOutStream (파일저장) - 저장하기
	// 2. byte[] 배열 변환 (getBytes())
	// 3. write
	// 4. flush

	public static void main(String[] args) {

		try {
			loadfile ld = new loadfile();
			ld.code();
		} catch (Exception e) {

		}

	}

}


class loadfile {
	File f = null;
	InputStream is = null;
	OutputStream os = null;

	public void code() throws Exception {
		//신규로 문자를 적용할 경우 new byte를 새로 계산하여 적용해야함
		this.f = new File("E:\\pjk\\java1\\src\\Files\\abc.txt");
		this.is = System.in; // 사용자가 입력하는 문구
		 int length = this.is.available();
		byte[] word = new byte[length]; // 저장 기록 용량
		this.is.read(word); // 사용자가 입력한 내용을 배열로 저장

		System.out.println(Arrays.toString(word));

		this.os = new FileOutputStream(f,true);
		this.os.write(word); // 파일에 입력 문자 저장
		this.os.flush(); // 메모리 초기화
		this.os.close();
		this.is.close();

	}
}
