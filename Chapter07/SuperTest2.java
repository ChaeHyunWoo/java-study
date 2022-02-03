package Chapter07;

class Parent2 {
    int x=10;
}
//Child2클래스는 Parent2클래스를 상속받는다.
class Child2 extends Parent2 {
    int x=20;

    void method2() {

        System.out.println("x=" + x); // 20 -> Child2클래스의 멤버변수 사용
        System.out.println("this.x=" + this.x); // 20 -> this는 자식 클래스에 선언된 멤버변수를 뜻함.
        System.out.println("super.x=" + super.x); // 10 -> super는 부모 클래스로부터 상속받은 멤버변수를 뜻함
    }
}

public class SuperTest2 {
    public static void main(String[] args) {

        Child2 c2 = new Child2();// SuperTest2클래스에 Child2 클래스를 포함시켜 사용(포함관계)
        c2.method2();// Child2 클래스의 method2()메서드 호출

    }
}