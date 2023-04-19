package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		mem123 abb = new mem123();
		try {

			abb.aaa();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

//class mem123 {
//    FileReader fw1;
//    Scanner sc1;
//
//    public void aaa() throws Exception {
//        ArrayList<ArrayList<String>> all = new ArrayList<>();
//        this.fw1 = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
//        this.sc1 = new Scanner(this.fw1);
//
//        while (this.sc1.hasNext()) {
//            String datas = this.sc1.nextLine();
//            String[] sdata = datas.split(",");
//            ArrayList<String> abc = new ArrayList<>(Arrays.asList(sdata));
//            all.add(abc);
//        }
//        
//        System.out.println(all);
//    }
//}
//






class mem123 {
	Scanner sc1;
	FileReader fw1;
	
	String sdata[];
	public void aaa() throws Exception {
		ArrayList<String[]> abc = new ArrayList<>();
		
		this.fw1 = new FileReader("E:\\pjk\\java1\\src\\Files\\member.txt");
		this.sc1 = new Scanner(this.fw1);

		String datas;
		int cnt=0;
		while (this.sc1.hasNext()) {
			
			//splist으로 구분하여 1차 배열로 이관
			sdata = this.sc1.nextLine().split(",");
			abc.add(sdata); // 1차 배열 값을 2차 배열로 이관
										
		}
		System.out.println(Arrays.toString(abc.get(1)));
		System.out.println(Arrays.toString(abc.get(2)));
		
		//2차 배열 이상 출력시 deeptoString 및 toArray 메소드를 사용하면 정확한 배열값 확인가능
		System.out.println(Arrays.deepToString(abc.toArray()));
	
		
	


	}

}
