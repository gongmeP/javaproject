package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {
	
	public static void main(String[] args) throws Exception{
		try {
			//ANSI = EUCKR
//			Charset.forName("EUCKR") : 인코딩 언어셋을 변경할 때 사용합니다.
			// 출력하는 형태 언어셋만 바꾸는 명령어. 파일자체는 아님
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("EUCKR"));
			System.out.println(fr.getEncoding()); // 인코딩언어형태
			System.out.println(fr.read()); // 파일크기
			System.out.println(fr.read());
			
			while(true) {
				int a = fr.read();
				System.out.println((char)a);
				if(a==-1) {
					break;
					
				}
			}
			fr.close();
		}catch (Exception e) {
			System.out.println("파일 경로 실패");
			
		}
	}

}
