import java.util.Scanner;

public class Calculat {
	//숫자 두개 계산하는 계산기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("첫번째 숫자를 입력하세요");
		
		//변수 받아오기 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println("입력한 숫자는 "+ a + " 와 "+b+" 입니다.");
		int c = 1;
		do {
			System.out.println("=========================계산기==========================");
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나누고 나머지값 0.프로그램 종료");
			System.out.println("=======================================================");
			System.out.println("원하는 계산을 입력하세요.");
			
			c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("더한값 = "+ (a+b));
				break;
			case 2:
				System.out.println("빼기 = "+ (a-b));
				break;
			case 3:	
				System.out.println("곱한값 = "+ (a*b));
				break;
			case 4:	
				System.out.println("나누기 = "+ ((double)a/b));
				break;
			case 5:	
				System.out.println("나머지 = "+ (a%b));
				break;
			default :
				break;
			}	
		}while(c!=0);

	}

}
