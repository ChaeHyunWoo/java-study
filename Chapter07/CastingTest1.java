package Chapter07;

class Car {

    String color;
    int door;

    void drive() {
        System.out.println("drive, 부릉부릉~");
    }

    void stop() {
        System.out.println("stop, 멈춰!정지");
    }
}

class FireEngine extends Car {

    void water() {
        System.out.println("물뿌리기!");
    }
}

//부모 클래스 : Car / 자식 클래스 : FireEngine
public class CastingTest1 {
    public static void main(String[] args) {

        // Car 클래스, FireEngine 클래스는 상속관계
        Car car = null; // Car타입 참조변수 car를 선언하고 null로 초기화
        FireEngine fe = new FireEngine(); //인스턴스(객체)생성 / 포함관계
        FireEngine fe2 = null;

        fe.water();
        car = fe; // 자식 -> 부모 : up-casting / 형변환 생략가능
        //car.water(); // 에러!
        fe = (FireEngine)car; // 부모->자식 : down-casting
        fe2.water();

    }
}