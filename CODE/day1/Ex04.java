
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자
		//1.부호 연산자
		int a = 10;
		int b = -10;
		System.out.println(-a);
		System.out.println(-b);
		
		System.out.println(2+5);
		System.out.println(20-10);
		System.out.println(20*2);
		System.out.println(5/2);
		//정수끼리의 계산은 결과도 정수로 나온다
		System.out.println(5/2.0);//정수와 실수의 계산은 결과가 실수로 나온다.
		
		//나눗셈의 나머지를 구하는 연산자
		System.out.println(7 % 2);
		System.out.println(1 % 2);
		
		//=대입연산자 
		int c = 2 + 2;
		System.out.println(c);
		int d = 10;
		System.out.println(d+20);
		System.out.println(d);
		
		d = 30;
		System.out.println(d);
		
		int e = d;
		System.out.println(e);
		
		//변수의 선언 없이 변수를 사용할 수 없다. 
		//System.out.println(f);
		int f = e+d;
		System.out.println(f);
		
		//문자열끼리 덧셈
		//문자열과 다른타입의 값을 더하면 항상 결과가 문자열이 되어버린다
		System.out.println("안녕 "+"하세요");
		System.out.println("1"+"1");
		System.out.println(1+"1");
		System.out.println("1"+2.5);
		System.out.println("2"+true);
		
	}

}
