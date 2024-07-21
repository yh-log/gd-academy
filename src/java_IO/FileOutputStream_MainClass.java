package java_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_MainClass {

	public static void main(String[] args) {

		
//		FileOutputStream : 특정 파일로 데이터를 내보내는 바이트 출력 스트림
		
//		디렉터리 지정
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) {
			dir.mkdirs(); // 존재하지 않으면 만들어라
		}
		
//		파일 지정
		File file = new File(dir, "test1.dat");
		
		try {
	//		파일 출력 스트림
			FileOutputStream out = new FileOutputStream(file); // 예외처리를 하지 않으면 스트림 생성 불가

//			파일 출력 스트림으로 데이터 내보내기
			String str = "hello"; // hello = 5byte
			byte[]b = str.getBytes();
			out.write(b); // IOException 예외발생
			
//			파일 출력 스트림 닫기
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
