package Chapter07;

class Tv1 {
    //전역변수(인스턴스변수)
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    //power 메서드
    void power () {
        power = !power;
    }
    // 채널 업 메서드
    void channelUp() {
        ++channel;
    }
    //채널 다운 메서드
    void channelDown() {
        --channel;
    }
}

class Vcr {
    //전역변수(인스턴스변수)
    boolean power; // 전원상태(on/off)
    int counter = 0;

    // power 메서드
    void power() {
        power = !power;
    }
    //play,stop,rew,ff 메서드 내용 생략
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}

}
//TvCr클래스는 Tv1클래스를 상속받는다.
public class TvCr extends  Tv1 {

    Vcr vcr = new Vcr(); //TvCr클래스에  Vcr 클래스를 포함시켜 사용(포함관계)
    int counter = vcr.counter;
    
    //Vcr의 play,stop,rew,ff 메서드를 호출해서 사용
    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}