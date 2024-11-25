import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Can I ask U how old U R");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		//if문 
		//if괄호 안에 true/false만 가능 
		//if(!false) 
			//System.out.println("조건이 참 입니다.");
		
		if(age>=20)
			System.out.println("u r 성인");
		
		else 
			System.out.println("u r 꼬꼬마");
		

			
	}

}
