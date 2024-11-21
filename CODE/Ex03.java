
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수 
		
		//1.float (4byte ->32bit)
		float f = 2.2f; //float는 숫자뒤에 f를 붙어줘야함
		System.out.println("float = "+ f);
		
		//2.double (8byte ->64bit)
		double d =  1.3;
		System.out.println("double = "+ d);
		
		//실수 타입의 변수에 정수 값을 넣게 되면 소수점 한자리 0 을 붙여서 실수로 취급한다.
		double e = 2;
		System.out.println("double e = "+e);
		
		//논리타입,참 거짓 타입 
		boolean b = true;
		boolean b2 = false;
		System.out.println(b);
		System.out.println(b2);
		System.out.println(1>=1);
		
		//문자열,참조 타입
		String s = "";
		System.out.println(s);
	}

}
