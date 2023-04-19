package Files;

import java.io.FileReader;
import java.io.IOException;

public class File1 {

	//I/O inputStream, OutputStream
	//입력스트림 : 프로그램으로 들어오는 부분(키보드 마우스 hdd)
	//출력스트림 : 모니터 하드 프린터 등
	
	//Stream : API 라이브러리 사용하는 형태
	//JAVA.io (API)
	
	//일반 : file , fileReader > StreamAPI
	//일반 : filewriter > StreamAPI
	
	//FileReader : 문자 데이터를 파일로 부터 읽어 들어서 들이는 클래스
	// - 파일 이름을 인수값(파라미터)로 사용해서 FileReader 객체로 생성합니다.
	
	//I/O는 throws를 사용하던가 , try~catch를 무조건 사용해야만 적용할 수 있음
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\message.txt");
		System.out.println(fr);

		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m==-1) {
				break;
			}
		}
		fr.close();
	}
	

}
