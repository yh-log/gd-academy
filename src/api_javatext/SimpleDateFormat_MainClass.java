package api_javatext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_MainClass {

	public static void main(String[] args) {

//		SimpleDateFormat 클래스
		
//		java.util.Date 클래스
		Date date = new Date();
		System.out.println(date);
		
//		Pattern 문자
		
//		SimpleDateFormat 객체 선언 및 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd E a h:mm:ss.SSS");
		String result = sdf.format(date);
		System.out.println(result);
		
	}

}
