package java_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_MainClass {

	public static void main(String[] args) {

//		FileWriter 클래스 : 특정 파일로 문자를 내보내는 문자 출력 스트림
//		구분기준 : 텍스트(문자), 아닐경우(바이트)
		
//		디렉터리 지정
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
//		파일 지정
		File file = new File(dir, "test1.txt");
		
//		try - catch - resources : 사용한 리소스(스트림)을 자동으로 닫는 try 문 
		
		try (FileWriter writer = new FileWriter(file)){
			
//			데이터 내보내기
			String str = "안녕하세요";
			writer.write(str);
			
//			파일 출력 스트림 닫기
//			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//			파일 정보 확인
		System.out.println(file.getPath() + "파일 생성 완료 " + file.length() + "바이트");
		
	}

}
