package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File13 {

	//파일 생성
	public static void main(String[] args) throws IOException {
		try {
			
			File fi = new File("E:\\pjk\\java1\\src\\Files\\abc.txt");
			System.out.println(fi.exists());
			
			if(fi.exists()==false) { //해당 경로에 파일이 없을경우 
				fi.createNewFile(); // 파일생성
			}
			String data = "홍길동"; // 데이터
			OutputStream os = new FileOutputStream(fi); // 파일 저장 경로인 fi로 호출
			byte[] b = data.getBytes(); // 데이터를 byte단위로 생성
			os.write(b); // 파일에 쓰기 
			os.flush(); // 메모리 초기화
			os.close(); // 파일 닫기
			
			
			
		}catch (Exception e) {
			
		}
		
		
		
	}

}
