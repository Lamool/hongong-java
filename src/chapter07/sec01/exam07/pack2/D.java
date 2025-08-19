package chapter07.sec01.exam07.pack2;

import chapter07.sec01.exam07.pack1.A;

public class D extends A {
    public D() {
        /*
        A 클래스와 다른 패키지.
        A의 자식 클래스기 때문에 A 클래스의 protected 필드, 생성자, 메소드에 접근 가능
        단, new 연산자를 사용해서 생성자를 직접 호출할 수는 없다.
        자식 생성자에서 super()로 A 생성자를 호출할 수 있다.

        super();
        this.field = "value";
        this.method();
        */
    }


}
