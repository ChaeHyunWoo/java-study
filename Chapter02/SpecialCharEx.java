//예제2-8
package Chapter02;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');// '''처럼 할수 없다. 결과 : '
        System.out.println("abc\t123\b456"); //\b에 의해 3이 지워진다 / 결과: abc  123456
        System.out.println("\n"); // 개형(new line)문자 출력하고 개행 / 결과 : 빈줄 출력
        System.out.println("\"Hello\""); // 큰따옴표를 출력하려면 이렇게한다 / 결과 : "Hello"
        System.out.println("c:\\"); // 결과 : c:\
    }
}
