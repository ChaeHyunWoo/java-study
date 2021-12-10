//예제 2-2
package Chapter02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10 , y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x; //x는 10인데 10을 tmp에 넣어준다 -> tmp=10
        x = y; // y값을 x에 넣어준다. x = 20
        y = tmp; // tmp값을 y에 넣어준다. 위에서 tmp=10이므로 y=10

        System.out.println("x:" + x + " y:" + y);
    }
}
