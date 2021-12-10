//예제 2-12
package Chapter02;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score = " + score); //결과 : score = 85
        System.out.println("d = " +d); // 결과 : d = 85.4
    }
}
