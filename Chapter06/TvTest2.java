package Chapter06;

class Tv2 {

    // Tv의 속성(맴버 변수)
    String color;
    boolean power;
    int channel;

    //Tv의 기능( 메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}

public class TvTest2 {

    public static void main(String[] args) {

        Tv t2 = new Tv();
        Tv t3 = new Tv();

        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        System.out.println("t3의 channel값은 " + t3.channel + "입니다.");

        t3 = t2;
        t2.channel = 7;
        System.out.println("t2의 channel값을 7로 변경했습니다.");
        
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
    }
}
