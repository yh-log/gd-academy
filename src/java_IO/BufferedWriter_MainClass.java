package java_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_MainClass {

	public static void main(String[] args) {

//		BufferedWriter 클래스 : 버퍼링된 문자를 내보내는 문자 출력 스트림
		
//		디렉터리 지정
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
//		파일 지정
		File file = new File(dir, "test2.txt");
		
//		try - catch - resources
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			
//			데이터 내보내기
			String str1 = "안녕하세요";
			String str2 = "반갑습니다";
			
			writer.write(str1);
//			writer.write("\n"); // 커서를 내리고 -> 왼쪽으로 커서를 옮기기
			writer.newLine(); // FileWriter에는 newLine() 사용 불가능
			writer.write(str2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
