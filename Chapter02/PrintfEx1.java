//예제 2-4
package Chapter02;

public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; //long big = 100000000000
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b = %d%n", b); // b = 1
        System.out.printf("s = %d%n", s); // s = 2
        System.out.printf("c = %c, %d %n", c, (int)c); // c = A, 65   %d가 왜 65가 나왔냐? 영문 대문자 'A'는 숫자 65를 뜻함
        System.out.printf("finger = [%5d]%n", finger); // finger = [   10]
        System.out.printf("finger = [%4d]%n", finger);//finger = [  10]
        System.out.printf("finger = [%3d]%n", finger);//finger = [ 10]
        System.out.printf("finger = [%d]%n", finger);// finger = [10]
        System.out.printf("finger = [%-5d]%n", finger);// finger = [10   ]
        System.out.printf("finger = [%05d]%n", finger); // finger = [00010]

        System.out.printf("big = %d%n", big);// big = 100000000000
        System.out.printf("hex = %x %n", hex); // hex = ffffffffffffffff    %x는 16진정수의 형식으로 출력
        System.out.printf("hex = %#x %n", hex);// hex = 0xffffffffffffffff  %x는 16진정수의 형식으로 출력 // #은 접두사 0x가 붙는다
        System.out.printf("hex = %#X %n", hex);// hex = 0XFFFFFFFFFFFFFFFF  %X는 16진정수의 형식으로 출력(대문자로출력)

        System.out.printf("octNum = %o, %d%n",octNum, octNum);// octNum = 10, 8    %o는 8진정수의 형식으로 출력 // 8진수 10, 10진수 8
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);// hexNum = 10, 16
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);// binNum = 10, 2
        //10진수를 2진수로 출력해주는 지시자는 없어 정수를 2진 문자열로 변환해주는 Integer.toBinaryString(int i)를 사용하고 이 메서드는 정수를
        //2진수로 변환해서 문자열로 반환하므로 지시자 %s를 사용함.


    }
}
