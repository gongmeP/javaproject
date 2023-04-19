package Files;
import java.io.FileInputStream;
import java.io.InputStream;

public class File12 {

	// Stream을 이용한 파일로드
	public static void main(String[] args) {
		
		try {
			filein fi = new filein();
			fi.fileload();
		}catch (Exception e) {
			System.out.println("메소드 오류");
		}

	}

}

class filein {
	InputStream is = null;
	
	public void fileload() throws Exception {
		this.is = new FileInputStream("E:\\pjk\\java1\\src\\Files\\notice.txt");
		//available() : 파일의 용량 크기를 확인 가능. (byte 단위로)
		System.out.println(is.available());
		
		//byte temp 배열값을 파일 로드한 크기와 동일하게 생성해줌.
		//지정해준 용량 이상의 데이터면 짤려버림
		byte temp[] = new byte[is.available()];
		//파일의 용량크기 지정도 가능 . 첨부파일 2메가
		byte temp2[] = new byte[1024*16];
					
//		this.is.read(temp);
//		String data = new String(temp);
		
		String data = new String(temp, 0, this.is.read(temp));
		System.out.println(data);
			
		
	}
}