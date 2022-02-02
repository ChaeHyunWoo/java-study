package Chapter07;

class Shape {
    //전역변수(인스턴스변수)
    String color = "black";

    // draw 메서드
    void draw() {
        System.out.printf("[color = %s]%n", color);
    }
}

class Point {
    //전역변수(인스턴스변수)
    int x;
    int y;

    //매개변수가 있는 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    //생성자
    Point() {
        this(0,0);
    }

    // 메서드
    String getXY() {
        return "(" + x + "," + y + ")"; // x와 y값을 문자열로 반환
    }
}
// Circle 클래스에 Shape 클래스 상속받기
class Circle extends Shape { // Circle와 Shape는 상속 관계
    //전역변수(인스턴스변수)
    Point center; //원의 원점좌표 , Circle와 Point는 포함 관계
    int r; // 반지름

    //생성자
    Circle() {
        this(new Point(0,0), 100); // Circle(Point center, int r) 호출
    }
    //매개변수가 있는 생성자
    Circle(Point center, int r) {
        this.center = center;
        this.r =r;
    }
    // draw 메서드
    void draw() { //원을 그리는 대신에 원의 정보를 출력
        System.out.printf("[center = (%d,%d), r = %d, color = %s]%n", center.x, center.y, r, color);
    }
}
// Triangle 클래스에 Shape 클래스 상속받기
class Triangle extends Shape {

    Point [] p = new Point[3]; // 3개의 Point인스턴스를 담을 배열 생성
    //생성자
    Triangle(Point[] p) {
        this.p = p;
    }
    //draw 메서드(Override)
    void draw() {
       System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}

public class DrawShape {

    public static void main(String[] args) { // main 함수

        Point [] p = { new Point(100, 100),
                       new Point(140,50),
                       new Point(200,100)
        };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150), 150);
        //위의 문장은 이 두 문장을 합친 것이다.
        // Point p = new Point(150,150);
        // Circle c = new Circle(p,50);

        t.draw(); // 삼각형을 그린다.
        c.draw(); // 원을 그린다.

    }

}