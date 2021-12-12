//예제4-13/ch4/FlowEx13.java
package Chapter04;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;  // 합계를 저장하기 위한 변수

        for(int i=1; i <= 10; i++) {
            sum +=1; //sum = sum + i
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}