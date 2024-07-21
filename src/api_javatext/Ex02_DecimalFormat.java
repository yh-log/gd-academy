package api_javatext;

import java.text.DecimalFormat;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
"10,000"과 "5,000" 문자열을 숫자로 변환한 뒤 그 합인 15000을 "15,000" 형식으로 출력하시오.
*/
	public class Ex02_DecimalFormat {

	public static void main(String[] args) {

		exam();
		
	}
	
	public static void exam() {
		String money1 = "10,000";
		String money2 = "5,000";
		
		try {
		
			DecimalFormat df = new DecimalFormat("0");
			
			int c = Integer.parseInt(money1);
			int d = Integer.parseInt(money2);
			
			String a = df.format(c);
			String b = df.format(d);
			
			
			System.out.println(a);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
