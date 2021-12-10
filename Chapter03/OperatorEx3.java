//예제3-3/ch3/OperatorEx3.java
package Chapter03;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i = 5, j = 5;
        System.out.println(i++);  //결과 : 5
        // i++은 후위형이라 값이 참조된 후에 증가시킨다. 그래서 println()에게 i의 값 5를 넘겨주고 나서 i의 값이 증가하기에 결과는 5출력
        System.out.println(++j);  //결과 : 6
        // ++j은 전위형이라 값이 참조되기 전에 증가시킨다. 그래서 println()에게 j의 값을 넘겨주기전에 1 중가시켜 6을 넘겨줘서 결과는 6출력
        System.out.println("i = " + i + ", j = " + j);  // 결과 : i = 6, j = 6;
        //위에서 결과는 5와 6이 출력됬지만 i와 j는 모두 6이 들어있다. 따라서 둘다 6으로 출력된다.
    }
}
