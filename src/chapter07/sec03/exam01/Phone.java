package chapter07.sec03.exam01;

public abstract class Phone {
    // 필드
    public String owner;

    // 생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    // 메소드
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

    /*
        추상 클래스 선언 방법 : 클래스 선언에 abstract 키워드를 붙이면 된다.
        public abstract class 클래스 {
        }

        추상 클래스 - 일반 클래스와 마찬가지로 필드, 생성자, 메소드 선언 가능
                  - new 연산자로 직접 생성자 호출 불가능
                    자식 객체가 생성될 때 super(...)를 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 한다.

    */
}
