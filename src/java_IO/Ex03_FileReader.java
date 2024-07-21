package java_IO;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
파일의 내용을 읽어서 그대로 화면에 출력하시오.
*/	

import java.io.BufferedReader;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
/app/upload/exam/exam.txt 파일의 내용을 읽어서 그대로 화면에 출력하시오.
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex03_FileReader {

	public static void main(String[] args) {

		exam2();
		
	}
	
	public static void exam1() {
		
		File file = new File("\\app\\upload\\exam", "exam.txt");
		
		StringBuilder sb = new StringBuilder();
		
		try(FileReader read = new FileReader(file)) {
			
			int c;
			
			while((c = read.read()) != -1) {
				sb.append((char)c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		
	}

	
	public static void exam2() {
		String filePath = "/devel/storage/exam.txt";
		
//		FileReader 와 BufferdeReader 를 사용해 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			
		       String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void exam3() {
		
//		String filePath = "app/upload/exam/exam.txt";

		StringBuilder sb = new StringBuilder();
		
		try {

//			File file = new File(filePath);
			
			File file = new File("\\devel\\storage", "exam.txt");
			
			FileReader fileRead = new FileReader(file);
			
			int c;
			
			while((c = fileRead.read()) != -1) {
				sb.append((char)c);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(sb);
		
	}
	
}
