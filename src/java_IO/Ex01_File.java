package java_IO;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
현재 폴더의 /app/upload/exam/logo.png 파일의 최종수정일을 "yyyy-MM-dd HH:mm:ss" 형식으로 출력하시오.
*/

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex01_File {

	public static void main(String[] args) {

		exam1();
		exam2();
	}
	
	public static void exam1() {
	
		File homeFile = new File("\\app\\upload\\exam\\logo.png");
		File[] files = homeFile.listFiles();
		
		for(File file : files) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
		}
	
		
	}
	
	public static void exam2() {
		
		try {
		String filePath = "/app/upload/exam/logo.png";
		
		File file = new File(filePath);
		
		File[] files = file.listFiles();
		
		for(File file1 : files) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file1.lastModified()));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void exam3() {
		String filePath = "/app/upload/exam/logo.png";
		
		File file = new File(filePath);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(file.lastModified()));
	}

}
