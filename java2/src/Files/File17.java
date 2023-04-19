package Files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File17 {
//이미지 용량 제한 체크 프로세스 만들기
	// 이미지 업로드 할 수 있는 최대 용량은 1mb 이하 입니다.
	// 1mb 이상 파일을 업로드시 "이미지 제한 용량은 1MB" 이하까지입니다. 메세지 출력
	// 정상적인 1MB이하면 e:memo에 이미지 복사되도록 함
	public static void main(String[] args) {
		try {
			loads abc = new loads();
			abc.as();
		} catch (Exception e) {

		}
	}

}

class loads {

	public void as() throws Exception {
		try {

			File f = new File("E:\\memo\\Apink.jpg");
//			File f = new File("E:\\memo\\1427.JPG");
			InputStream is = new FileInputStream(f);
			System.out.println(is.read());


			if (is.available() > 1048576) {
				System.out.println("이미지 제한 용량은 1MB 이하 까지 입니다.");

			} else {
				BufferedInputStream bs = new BufferedInputStream(is);
				
				byte img1[] = new byte[bs.available()];
				OutputStream os = new FileOutputStream("E:\\memo\\copys1.jpg");
				
				os.write(img1,0,bs.available());
				System.out.println("첨부파일 업로드가 완료되었습니다");

			}
		} catch (Exception e) {

		}

	}
}