//예제 2-11
package Chapter02;

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);//floatToIntBits()는 float타입값을 int타입값으로 해석해서 반환해준다.

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); //16진수로 출력
    }
}
