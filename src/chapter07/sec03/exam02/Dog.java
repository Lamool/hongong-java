package chapter07.sec03.exam02;

public class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    // 추상 메소드 재정의. 추상 메소드 재정의 안 하게 되면 컴파일 에러 발생.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
