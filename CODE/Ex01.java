
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 
		//정수 
		//1.byte
		byte b;
		
		//변수의 초기화 
		b=20;
		System.out.println(b);
		b=40;
		System.out.println(b);
		
		//자바에서 숫자의 연산을 할 때 임이의숫자는 int로 취급 근데 20은 int 로 취급되서 에러 
//		b = b+20;
		
		//2.short 
		short s = 20;
		
		//3.char 
		char c = 67;
		System.out.println((int)c);
		
		//4.int
		int i = 28;
		System.out.println(i);
		i = 38;
		i = i+12;
		System.out.println(i);
		
		//5.long
		long l = 100L;
		
		//실수 타입
		//1.float 
		float f = 20.5f;
		System.out.println(f);
		
		//2.double
		double d = 20.2;
		System.out.println(d);
		//정수와 정수끼리의 연산은 항상 정수
		//실수와 실수끼리의 연산은 항상 실수
		//정수와 실수끼리의 연산은 항상 실수 
		System.out.println(5/2);
		System.out.println(5.0/2.0);
		
		//논리타입 
		//boolean
		boolean g = true;
		System.out.println(g);
		g = false;
		System.out.println(g);
		
		
		
		
	}

}
