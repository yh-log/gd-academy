package api_javatime;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
2024.12.25. 12:00:00 형태로 출력하시오.
*/		

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01_javaTime {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String str = "2024-12-25T12:00:00";

		LocalDateTime time = LocalDateTime.parse(str);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm:ss");
		
		String str2 = dtf.format(time);
		
		System.out.println(str2);
		
		
	}

}
