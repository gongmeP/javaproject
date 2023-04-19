package Files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

// 라이브러리 : io (기본 input,output만 사용 ) / nio (버퍼를 활용하는 io , 성능좋음)
// nio2 : nio 를 개선하여 file 클래스보다 더 빠르게 사용

public class File9 {

	// 파일 데이터를 배열로 전송 하기 IO
	public static void main(String[] args) {
		try {
			filedata fd = new filedata();
			fd.addfile();
		} catch (Exception e) {

			System.out.println("메소드 호출 오류");
		}

	}

}

class filedata {

	
	// Files.readAllLines : 파일 전체 모든 텍스트 라인을 읽어들임
	// List(최상위), ArrayList (일반 형식 배열)

	// LinkedList : 파일 전체 라인에 대한 배열값을 적용하지 못함, 객체를 인스턴스 메모리로 등록 시킨 후 강제로 파일 배열값을 적용 할 수 있음
	// Files.readAllLines 메소드는 파일의 모든 텍스트 라인을 읽어들여 List 인터페이스를 구현한 ArrayList 객체로
	// 반환합니다
	// 따라서 Files.readAllLines 메소드의 반환값을 LinkedList로 바로 받을 수 없으며, ArrayList로 받아서 변환하는
	// 방법을 사용해야 합니다.
	ArrayList<String> data = null;
	
	LinkedList<String> data2 = null;

	public void addfile() throws Exception {
		// Paths.get : 파일 경로 불러오는거
		// readAllLines : 전부 읽음
		this.data = (ArrayList<String>) Files.readAllLines(Paths.get("E:\\pjk\\java1\\src\\Files\\notice.txt"));
		System.out.println(data);
		
		//비추
		this.data2 = new LinkedList<String> (Files.readAllLines(Paths.get("E:\\pjk\\java1\\src\\Files\\notice.txt")));
		System.out.println(data2);
		
		//원시배열로 처리 (byte단위) : 언어패킷을 사용하지 못함. 1차 배열로만 처리됨
		//단점 : byte는 메모리 할당이 많아짐
		byte data3[] = Files.readAllBytes(Paths.get("E:\\pjk\\java1\\src\\Files\\notice.txt"));
		System.out.println(new String(data3));
	}
}
