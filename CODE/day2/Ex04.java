
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입연산자
		int i = 10;
		// i = i +10;
		i += 10;
		System.out.println(i);

		i -= 10;
		System.out.println(i);

		i *= 10;
		System.out.println(i);

		// i /=10;
		// i = i/3.0; int 타입에 실수 대입 불가능
		i /= 3.0; // 대입연산자가 있으면 그냥 int로 계산함
		System.out.println(i);

		//i = i % 3;
		i %= 3;
		System.out.println(i);
		
		//증감연산자 
		int j = 0;
		//j = j+1; j = j-1;
		System.out.println(j+1);
		System.out.println(j++);
		System.out.println(j);
		System.out.println(++j);
		System.out.println(j--);//j==2
		//j==1
		System.out.println(--j);
		int k = 10;
		k = k + k++;
		//대입연산자가 있을떈 ++가 뒤에있으면 대입할땐 실행안된다 
		System.out.println(k);
		
		int result = 10 + k++;
		System.out.println(result+""+k);
	}

}
