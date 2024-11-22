
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입의 변환 
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10L;
		
		//더 큰 타입의 변수에 작은 타입의 변수 값을 대입해도 문제가 발생하지 않는다.
		l = i;
		i = s;
		s = b;
		
		//더 작은 타입의 변수에 큰 타입의 변수값을 대입하기 위해서는 강제로 타입변환 필요
		b= (byte)s;
		s = (short)i;
		i = (int)l;
		
		//이상의 값이 들어오면 초기화 됨 ->정수오버플로우 현상 
		s = 129;
		System.out.println((byte)s); //=-127 
		
	}

}
