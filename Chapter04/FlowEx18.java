//예제4-18/ch4/FlowEx18.java
package Chapter04;

public class FlowEx18 {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++) {   //2단부터 9단까지
            for(int j=1; j<=9; j++) { // *1부터 *9까지
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
        }
    }
}