package chapter07.sec01.exam01;

public class DmbCellPhone extends CellPhone {       // 상속 - extends 사용. // 자식클래스 extends 부모클래스
    /*
        자바 상속 특징
        1. 여러 개의 부모 클래스를 상속할 수 없다.
            extends 뒤에는 단 하나의 부모 클래스만 와야 한다.
            (extends 부모클래스1, 부모클래스2 -> 불가능)
        2. - 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외된다.
           - 부모 클래스와 자식 클래스가 다른 패키지에 존재한다면
             default 접근 제한을 갖는 필드와 메소드도 상속 대상에서 제외된다.
    */

    // 필드
    int channel;

    // 생성자
    DmbCellPhone(String model, String color, int channel) {
        /*
            1. 부모 생성자는 자식 생성자의 맨 첫 줄에서 호출된다.
            2. super()
                - 부모의 기본 생성자를 호출한다.
                - 생략 가능하다.
            3. super(매개값, ...)
                - 생략되면 컴파일러에 의해 super()가 자동적으로 추가된다.
                 그렇기에 부모의 기본 생성자가 존재해야 한다.
                - 부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면
                 자식 생성자에서 반드시 부모 생성 호출을 위해 명시적으로 호출해줘야 한다.
                - 반드시 자식 생성자 첫 줄에 위치해야 한다.
        */

        // CellPhone 클래스로부터 상속받은 필드 : model, color
        this.model = model;
        this.color = color;

        this.channel = channel;
    }

    // 메소드
    void turnOnDmb() {
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
