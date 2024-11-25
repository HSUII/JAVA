package practiceprogrammers;

import java.util.Scanner;
//길이가 다른 문자열을 원하는 위치에서 합치는 프로그램
public class Lv01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = sc.nextInt();
		String s3 = "";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		String ans = "";
		int k = 0;
		for(int i=n;i<=n+s2.length();i++) {
			c1[i] = c2[k];
			k++;
		}
		System.out.println(c1);
		for(int a = 0;a<c1.length;a++)
			ans = ans+c1[a];
		System.out.println(ans);
	}

}
