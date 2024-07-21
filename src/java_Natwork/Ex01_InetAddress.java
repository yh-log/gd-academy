package java_Natwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
https://pre.goodee.co.kr/member/myclassroom?memno=40&classno=2&orderno=1#totalviewarea
도메인과 IP주소를 출력하시오.
*/

public class Ex01_InetAddress {

	public static void main(String[] args) {

//		throws를 해주었으니 main 메소드에서도 try-catch를 해줘야 한다.
		try {
			exam();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void exam() throws UnknownHostException {
		
		
		try {
			
			byte[] ipaddr = {112, (byte)175, (byte)247, (byte)163};
			InetAddress ip = InetAddress.getByAddress("www.gdu.co.kr",ipaddr); 
			
			
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
