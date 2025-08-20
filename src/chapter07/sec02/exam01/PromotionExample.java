package chapter07.sec02.exam01;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // 상속 관계에 있지 않기 때문에 컴파일 에러 발생
        // B b3 = e;
        // C c2 = d;



        // ========================================
        // p.333 Cat, Animal 테스트
        B b10 = new B();
        A a10 = b10;            // A a10 = new B(); 도 가능

        // b10과 a10 둘 다 B 객체를 참조한다.
        // a10이 A 타입이라고 부모인 A 객체를 참조하는 것이 아니다.
        System.out.println(b10 == a10); // true // 두 변수가 동일한 객체를 참조하고 있다.
    }

    /*
        * 자동 타입 변환
        - 클래스에도 타입 변환이 있다.
        - 클래스의 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
        - 자식은 부모 타입으로 자동 타입 변환이 가능하다.

        - 자동 타입 변환 -> 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다.

        - 바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환 가능
    */
}
