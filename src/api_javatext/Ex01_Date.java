package api_javatext;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
"2024년12월25일\"인 문자열을 이용하여 \"2024-12-25 Wed\" 형태로 변경하여 출력하시오.
*/
	
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Ex01_Date {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String str1 = "2024년12월25일";
		
		try {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E", Locale.ENGLISH);
		
		String str2 = sdf2.format(sdf1.parse(str1)); // parse() : 문자열을 Date 객체로 변환하는데 사용
						  // format() : SimpleDateFormat 클래스의 메소드로 특정 형식의 문자열로 변환하는데 사용
		
		System.out.println(str2);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
