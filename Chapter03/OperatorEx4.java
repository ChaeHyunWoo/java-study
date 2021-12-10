//예제3-4/ch3/OperatorEx4.java
package Chapter03;

public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i);  //결과 : -10

        i = -10;
        i = -i;
        System.out.println(i); // 결과 : 10
    }
}
