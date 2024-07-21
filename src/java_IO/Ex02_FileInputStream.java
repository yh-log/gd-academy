package java_IO;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
1000바이트를 읽은 뒤 파일의 크기를 출력하시오
*/

import java.io.FileInputStream;

public class Ex02_FileInputStream {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		
		try {
			
			String filePath = "/app/upload/exam/logo.png";
			
			
//			1. 기존 크기 - 1000
//			File files = new File(filePath);
//			
//			FileInputStream file = new FileInputStream(files);

//			long fileSize = files.length();
//			
//			
//			byte[] b = new byte[1000];
//			int byteRead = file.read(b);
//			
//			long n = fileSize - byteRead;

			
//			2. available() 를 활용한 풀이 방법
			
			FileInputStream file = new FileInputStream(filePath);
			
			byte[] b = new byte[1000];
			file.read(b);
			
			int n = file.available();
			
			System.out.println(n);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
