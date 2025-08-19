package chapter07.sec01.exam03;

public class Computer extends Calculator {
    /*
        메소드 재정의 : 자식 클래스에서 부모 클래스의 메소드를 다시 정의하는 것

        방법
        1. 부모의 메소드와 동일한 시그너처 (리턴 타입, 메소드 이름, 매개 변수 목록)를 가져야 한다.
        2. 접근 제한을 더 강하게 재정의 할 수 없다.
            ex) 부모 메소드가 public 접근 제한을 가지고 있을 경우, 재정의하는 자식 메소드는 default나 private 접근 제한으로 수정할 수 없다.
                반대는 가능. 부모 메소드 default 접근 제한을 가지면, 재정의하는 자식 메소드 default 또는 public 접근 제한 가질 수 있다.
    */

    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
