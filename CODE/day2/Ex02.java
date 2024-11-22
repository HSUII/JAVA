
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자
		// 비교 연산자
		// 1.작다
		System.out.println(1 < 2);
		System.out.println(2 < 1);

		// 2.작거나 같다.
		System.out.println(1 <= 2);
		System.out.println(1 <= 1);
		System.out.println(2 <= 1);

		// 3.같다
		System.out.println(1 == 1);
		System.out.println(1 == 2);

		// 4.같지 않다.
		System.out.println(1 != 2);

		// 5.크거나 같다
		System.out.println(1 >= 1);
		System.out.println(1 >= 2);

		// 6.크다
		System.out.println(1 > 2);
		System.out.println(2 > 1);

		boolean b = 1 > 1;
		System.out.println(b);

		// 문자열끼리 비교
		System.out.println("Hello" == "Hello");
		System.out.println("Hell" == "Hello");
		System.out.println("Hell" != "Hello");

		// 문자끼리 비교
		System.out.println('A' == 'A');
		System.out.println('A' == 65);
		
		//실수와 정수끼리의 비교 
		//3과 3.0끼리의 비교 
		System.out.println(3 == 3.0);
	}

}
