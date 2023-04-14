package example;
import java2.mssql;

public class Example10 {

	public static void main(String[] args) {
		
		mssql ms = new mssql();
		ms.abc(); // 외부 메소드 로드
//		ms.main(args); // 권장안함 외부 메소드 메인로드(외부 java 파일 가져올시 main은 로드하지 않음)
		String x = ms.bbb();
		System.out.println(x); // 외부메소드 리턴 로드

	}

}
