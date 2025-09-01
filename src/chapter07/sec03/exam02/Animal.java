package chapter07.sec03.exam02;

public abstract class Animal {      // 추상 클래스
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();   // 추상 메소드

    /*
        모든 실체들이 가지고 있는 메소드의 실행 내용이 동일하다면 추상 클래스에 메소드를 작성하는 것이 좋음
        메소드의 선언만 통일하고, 실행 내용은 실체 클래스마다 달라야 하는 경우
        -> 추상 메소드 사용

        추상 메소드를 선언하는 방법
        추상 메소드는 선언부만 있고, 실행 블록을 가지지 않는다.
        -> [public | protected] abstract 리턴타입 메소드이름(매개변수, ...);

        추상 클래스 설계 시 하위 클래스가 반드시 실행 내용을 채우도록 강제하고 싶은 메소드가 있을 경우 해당 메소드를 추상 메소드로 선언
        자식 클래스는 반드시 추상 메소드를 재정의해서 실행 내용을 작성해야 한다.
    */
}
