package chapter07.sec02.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Child2 child2 = new Child2();

        Parent parent = child;        // 자동 타입 변환
        Parent parent2 = child2;      // 자동 타입 변환

        parent.method1();
        parent.method2();           // 재정의된 메소드가 호출됨
        // parent.method3();        // 호출 불가능

        parent2.method2();
    }

    /*
        - 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근 가능
        - 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로만 한정된다.

        - *****중요!!!***** 예외 사항, 메소드가 자식 클래스에서 재정의되었다면 자식 클래스의 메소드가 대신 호출된다. (다형성과 관련이 있음)
    */
}
