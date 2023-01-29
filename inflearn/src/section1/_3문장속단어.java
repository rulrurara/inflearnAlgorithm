package section1;

import java.util.Scanner;

public class _3문장속단어 {
	public static String solution(String str) {
//		String answer = "";
//		String[] str2 =	str.split(" ");
//		int max = 0;
//		int num = 0;
//		for(String x : str2) {
//			num = x.length();
//			if(num>max) {
//				max = num;
//				answer = x;
//			}
//		}
//		
//		return answer;
		String answer="";
		int m=Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}
}
