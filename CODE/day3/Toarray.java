package practiceprogrammers;

import java.util.Arrays;

public class Toarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		String str = Arrays.toString(arr);
		String str1 = str.replaceAll("\\[","").replaceAll("\\]", "").replaceAll("\\,", "");
		System.out.println(str1);
	}

}
