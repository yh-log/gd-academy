package java_IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdeOutputStream_MainClass {

	public static void main(String[] args) {

//		BufferdeOutputStream 클래스 : 버퍼링된 데이터를 내보내는 바이트 출력 스트림
		
		
//		디렉터리 지정
		File dir = new File("\\devel\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
//		파일 지정
		File file = new File(dir, "test2.dat");
		
		try {
		
		
//	//		파일 출력 스트림 생성
//			FileOutputStream fout = new FileOutputStream(file);
//			
//	//		버퍼링된 출력 스트림 생성 (기본적으로 파일 출력 스트림이 있어야 생성 가능)
//			BufferedOutputStream out = new BufferedOutputStream(fout);
		
//			파일 출력 스트림을 생성하지 않고 버퍼링된 스트림만 생성하는 것을 추천
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
			
		
//			출력 스트림으로 데이터 내보내기
			String str = "hello";
			byte[] b = str.getBytes();
			
			out.write(b);
			
//			출력 스트림 닫기
			out.close();
			
//			출력 메시지
			System.out.println(file.getPath() + "파일 생성, 파일의 크기는 " + file.length() + "바이트");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
