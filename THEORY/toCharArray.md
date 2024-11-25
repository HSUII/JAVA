## toCharArray()

- toCharArray() 메서드를 이용하면 문자열을 문자형 배열로 변환할 수 있다.   
- 리턴 타입이 char[] 타입으로 결과를 담을 변수 또한 char[]타입으로 선언해야 한다.   
- 문자 배열의 길이는 문자열의 길이와 같으며, 공백 또한 문자형으로 변환된다.

```java
public class Main{
  public static void main(String[] args){

      String str  = "Hello Java";
      char[] arr = str.toCharArray();

      System.out.println("arrr = " + Arrays.toString(arr));
    
  }

}
```
<예시문>     
   
![image](https://github.com/user-attachments/assets/b16f70b2-b1ca-4fa8-8219-0b5f32f3275b)
<결과>   
