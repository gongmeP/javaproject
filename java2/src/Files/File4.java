package Files;

import java.io.FileWriter;

//배열 파일로 정리 
public class File4 {

	public static void main(String[] args) throws Exception{
		
		//FileWriter : 문자 데이터를 파일에 쓰는 class	
			String userdata[] = {"hong","kim","park","jang","kang"};
			FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\message2.txt"); 
//			FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\message2.txt",true); 
			//FileWriter 에 true 를 붙이게 되면 기존 입력된 사항을 유지하고 추가 데이터가 들어감
	
			int x =0;
			
			while(x<userdata.length) { //write : 문자 배열 숫자등 다양한 데이터 값을 파일에 저장하는 명령어
				fw.write("{userdb:"+userdata[x]+"},");
				x++;
				
			}

			fw.close(); //파일 쓰기 종료
	}

}
