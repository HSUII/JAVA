
public class Ex02 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//변수 
			//메모리에 저장되는 값 예로 ram에 저장되는 값처럼 
		
		/*
		★변수의 선언
		타입 변수이름 
		정수, 실수, 문자, 문자열, 논리타입 
		*/
		
		/*정수 타입의 종류 
	 	1.byte(크기가 1byte->8bit) -128~128
		*/
		byte b = 10; //변수의 초기화(대입)
		System.out.println(b);
		 
		//2.short(2byte ->16bit) -32,768~32767
		short s = 100;
		System.out.println(s);
		
		//3.char :숫자,문자 둘다 가능 ( 2byte->16bit ) 0~65535 (양수만가능)
		char c;
		c = 65;
		System.out.println(c);
		c = 'B'; //한단어만 저장 가능, 문자는 ''로 표시  
		System.out.println(c);
		System.out.println((int)c);//숫자로 강제 변환 
		
		//4.int (4byte->32bit) -21억~+21억
		int i = 50;
		System.out.println("i는"+i);
		
		//5.long (8byte->64bit) -900경~900경
		long l = 0L;//long타입인걸 정확하게 인지해주고싶으면 숫자뒤에 L를붙여줘야함 
		
		int a;
		int z = 2000;
		System.out.println("z는 " +z);
		int x = 20;
		System.out.println("x는 " + x);
		
		int w = 10;
		
		
		int g = 100; 
		System.out.println("g = "+ g);
		
	
	}

}
