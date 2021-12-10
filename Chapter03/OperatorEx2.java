//예제3-2/ch3/OperatorEx2.java
package Chapter03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5,  j = 0;

        j = i++; //후위 : 값이 참조된 후에 증가시킨다. 쉽게 말하자면 i의 값 5를 j에 넣고 i를 1증가시킨다. 그러면 j는 5, i는 6이다.
        System.out.println("j = i++; 실행 후, i =" + i +", j = " + j);

        i = 5;  // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j = 0;

        j = ++i; // 전위 : 값이 참조되기 전에 증가시킨다. 쉽게 말하자면 i의 값 5를 j에 넣기전에 1증가시키고 넣는다. 그러면 j는 6, i는 6이다.
        System.out.println("j = ++i; 실행 후, i =" + i +", j = " + j);
    }
}  //실행결과 :
//j = i++; 실행 후, i =6, j = 5
//j = ++i; 실행 후, i =6, j = 6
