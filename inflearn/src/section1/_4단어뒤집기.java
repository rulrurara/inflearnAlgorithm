package section1;

import java.util.Arrays;
import java.util.Scanner;

public class _4단어뒤집기 {
	public static String solution(String str) {
		String answer = "";
		char[] qwe = str.toCharArray();
		char[] a = new char[str.length()];
		for(int i = 0 ; i < qwe.length;i++) {
				a[i] = qwe[qwe.length -1 - i];
		}
		for(int i = 0; i<a.length;i++) {
			answer += a[i];
		}
		//배열을 문자열로 바꾸기 이 방법 기억해두자!
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0 ; i < num ; i++) {
			String str = sc.next();
			System.out.println(solution(str));
		}
	}
}
