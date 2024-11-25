## 확장 for 문 
확장 for문은 JDK1.5이상부터 배열과 컬렉션에 저장된 요소에 기존 for문보다 접근하기 편리한 방법으로 처리할 수 있도록 새롭게 추가되었다.
 
for(타입 변수명:배열 또는 컬렉션){     	    
  //배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀져                          			 
  //변수에 저장된다    
}           
     
확장 FOR문의 구조는 위와 같으며, 세미클론(;)이 아닌 클론(:)으로 구분된다.    
변수명: 배열명 으로 선언한 뒤, 변수명으로 출력하면 해당 인덱스대로 배열원소값이 출력된다.    
확장 FOR문은 일반적인 FOR문과 달리 배열과 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.    

```java
for(int k:score) 
  System.out.print(k+" ");     
```
<예시1>    
위의 예제를 보면 k변수를 선언하고, score 배열에 대한 원소 값을 출력하는 확장 for문이다.    
또는 sum변수를 선언하고 sum+=k;문장을 추가해 score변수 원수값의 누적합들도 구할 수 있다.   

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch : a.toCharArray())
            System.out.println(ch);
    }
}
```
<문자열 a를 분리시켜 출력하는 프로그램>          

      

