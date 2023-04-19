package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class File16 {

	//이미지(Binary) 형태 byte 단위로 설정 (FileReader X)
	//1.InputStream 으로 이용
	//2. OutputStream으로 파일명만 생성
	//3. byte 단위로 처리사항 생성
	//4. 무한루프로 해당 원본파일을 지속적으로 읽어 들이면서 write로 복사함
	//5. -1 은 더이상 복제할 사항이 없을경우 무한루프 종료
	public static void main(String[] args) {
		try {
			//사용자가 업로드 하는 이미지
			InputStream is = new FileInputStream("E:\\memo\\Apink.jpg");
			System.out.println(is.read());
			
			
			//사용자가 이미지 크기를 계산 후 파일을 읽어들이는 크기
//			byte img[] = new byte[is.available()]; // 메모리 크기 만큼 한번에 이미지 사이즈를 읽어들임
			byte img[] = new byte[is.available()/100]; // 100을 나눠서 해당 크기만큼 읽음 > 전송률을 보여줄수있음
			OutputStream os = new FileOutputStream("E:\\memo\\Apink2.jpg");
			System.out.println(is.read(img));
			
			int imgs = 0; //읽는 바이트수
			int check = 0; // %로 사용자에게 생성율을 보여주기 위한 변수
			while(true) {
				imgs = is.read(img);
				if(imgs == -1) {
					break;
				}else {
					os.write(img,0,imgs); // 이미지를 카피함(byte단위로 지속적으로 생성)
				}
				if(check %2==0) {//%표기하는 코드 
					System.out.println(check + "%");
				}
				check++;
			}
		}catch (Exception e) {
			
		}

	}

}
