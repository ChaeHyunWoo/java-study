package Chapter07;

class Parent {
    int x=10;
}

class Child extends Parent {

    void method() {

        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

//SuperTest 클래스에 Parent 클래스를 상속 받음
public class SuperTest extends Parent {
    public static void main(String[] args) {

        Child c = new Child(); // SuperTest클래스에 Child 클래스를 포함시켜 사용(포함관계)
        c.method(); // Child 클래스의 method()메서드 호출

    }
}