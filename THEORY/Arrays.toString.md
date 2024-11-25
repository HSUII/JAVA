## Arrays.toString

일반적으로 배열을 출력할 때는 반복문을 사용한다.   
1. 반복문

```java
public class Main{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    for(int i = 0;i<arr.length();i++)
      System.out.printf(arr[i]);

  }
}
```

2. toString메소드 사용하기
Arrays.toString(arr);
파라미터로 배열을 받아서 배열에 정의된 값들을 문자열 형태로 만들어서 리턴해준다.

```java
import java util.Arrays;

public class Main{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    System.out.println(Arrays.toString(arr);
  }
}
```

다만  [] 괄호가 같이 나오기 때문에 같이 나오는게 싫을 땐 없애주는 작업을 따로 해줘야한다. 

```
String s = arr_toString.replaceAll("\\[","").replaceAll("\\]","");
```
