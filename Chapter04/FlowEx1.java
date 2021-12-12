//예제4-1/ch4/FlowEx1.java
package Chapter04;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d 일 때, 참인 것은 %n", x); // x = 0 일 때, 참인 것은
                                                        //하단 if문 4개 중에 참인 것만 출력
        if (x==0) System.out.println("x==0");           // 참(true)라서 출력
        if (x!=0) System.out.println("x!=0");           // 거짓
        if (!(x==0)) System.out.println("!(x==0)");     //거짓
        if (!(x!=0)) System.out.println("!(x!=0)");     // 참(true)라서 출력

        x = 1;
        System.out.printf("x = %d 일 때, 참인 것은 %n", x);//x = 1 일 때, 참인 것은

        if (x==0) System.out.println("x==0");           // 거짓
        if (x!=0) System.out.println("x!=0");           // 참(true)라서 출력
        if (!(x==0)) System.out.println("!(x==0)");     // 참(true)라서 출력
        if (!(x!=0)) System.out.println("!(x!=0)");     // 거짓
    }
}