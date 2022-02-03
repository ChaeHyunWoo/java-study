package Chapter07;

class Point1 {
    int x=10;
    int y=20;

    Point1(int x, int y) {
        //생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 super()를 여기에 삽입한다.
        //super()는 Point클래스의 조상인 Object클래스의 기본 생성자인 Object()를 의미
        this.x = x;
        this.y = y;
    }
}
//Point3D클래스에 Point1클래스를 상속받음
class Point3D extends Point1 {
    int z=30;

    Point3D() {
        this(100, 200, 300);	// Point3D(int x, int y, int z)를 호출
    }

    Point3D(int x, int y, int z) {
        super(x, y); // Point1(int x, int y)를 호출 , super는 부모클래스의 생성자를 호출할 때 사용해서
        this.z = z;  //
    }
}

public class PointTest {
    public static void main(String argsp[]) {

        Point3D p3 = new Point3D(); // PointTest클래스에 Point3D클래스를 포함시켜 사용(포함관계)
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}