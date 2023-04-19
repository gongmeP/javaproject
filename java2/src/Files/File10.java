package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class File10 {

	// Strame 사용법
	// Strame : 이미지 , 동영상 , 오디오 같은 파일을 로드하기 위해서 사용
	// InputStream(최상위) : 모든 입력 장치에 대한 값을 받는 클래스 기본은(int)
	// - FileInputStream, AudioInputStream , ObjectInputStream
	// - InputStreamReader : 언어셋을 변경 할 때만 사용합니다.

	// OutputStream : 모든 출력 장치에 대한 클래스
	public static void main(String[] args) {
		InputStream is = new InputStream() { // 사용시 오버라이드 메소드 기본 적용됨, (read외는 별도의 메소드 구성 안함)

			@Override
			public int read() throws IOException {
				int a = 15;
				return a;
			}
			
		};
		try {
			//read 메소드를 호출하여 값을 return 받음 . 데이터값을 읽음
			System.out.println(is.read());
			is.close();
			
		} catch (Exception e) {

		}
		
		//키보드값 로드
		System.out.println("키보드를 입력하세요");
		InputStream user = System.in; 
		try {
			
			int keycode = user.read();// 사용자가 입력한 키를 읽어서 ASCII 코드로 변환
			System.out.println(keycode);
			user.close();
		}catch (Exception e) {
			
		}
		
		//InputStreamReader(파일 언어셋 변경하기 위해서씀) > FileinputStream
		InputStreamReader ir = new InputStreamReader(is);
		try {
			System.out.println(ir.read());
			ir.close();
		}catch (Exception e) {
			
		}
		
		
		
		

	}

}
