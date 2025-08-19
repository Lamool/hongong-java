package chapter07.sec01.exam06;

public class Car {
    /*
        * 재정의할 수 없는 final 메소드
        - 메소드 선언 시 final 키워드를 붙이면 최종적인 메소드이므로 재정의할 수 없는 메소드가 된다.
        - 부모 클래스를 상속해서 자식 클래스를 선언할 때 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재정의할 수 없다.
        - public final 리턴타입 메소드([매개변수, ...]) { ... }
    */

    // 필드
    public int speed;

    // 메소드
    public void speedUp() {
        speed += 1;
    }

    // final 메소드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }

}
