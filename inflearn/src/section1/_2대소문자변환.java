package section1;

import java.util.Scanner;

public class _2대소문자변환 {
	public static String solution(String str) {
		String answer="";
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) {
//				answer += Character.toUpperCase(x);
//			}else {
//				answer += Character.toLowerCase(x);
//			}
//		}
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) {
				x -= 32;
				answer += x;
			}else {
				x += 32;
				answer += x;
			}
		}
		
		
		
		return answer;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
