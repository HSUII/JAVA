
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자
		// 그리고 , 또는
		// 진실, 그리고 진실
		// 그리고 해당하는 논리곱 AND
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		int age = 20;
		String gender = "남";

		System.out.println(age >= 20);
		System.out.println(gender == "남");

		// 연산자 우선순위 > , == 다음 &&
		System.out.println(age > 20 && gender == "남");
		System.out.println(age == 20 && gender == "여");
		System.out.println(age >= 20 && gender != "여");
		// & -> 엠퍼샌드

		// or (논리합) 연산자 ||(파이프 문자)
		System.out.println(true || true);
		System.out.println(true || false);

		System.out.println(1 >= 1);
		System.out.println(1 > 1 || 1 == 1);
		System.out.println(2 > 1 || 2 == 1);
		System.out.println(2 < 1 || 2 == 1);

		System.out.println(age == 20 || gender == "남");
		System.out.println(age < 20 || gender == "남");
		System.out.println(age != 20 || gender != "남");

		// 논리 부정
		// !

		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(age == 20));
		System.out.println(age > 20 && age < 19 && gender == "남");
		boolean b = true;
		b = !b;
		System.out.println(b);
		
		int i =20;
		i = i;
		System.out.println(i);

	}

}
