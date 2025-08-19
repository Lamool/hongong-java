package chapter07.sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        // DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
        /*
            - 부모 객체가 먼저 생성되고 그다음에 자식 객체가 생성된다.
            - DmbCellPhone 객체만 생성하는 것처럼 보이지만,
             사실은 내부적으로 부모인 CellPhone 객체가 먼저 생성되고 자식인 DmbCellPhone 객체가 생성된다.
        */

        // CellPhone 클래스로부터 상속받은 필드
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        // DmbCellPhone 클래스의 필드
        System.out.println("채널 : " + dmbCellPhone.channel);

        // CellPhone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요.");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
        dmbCellPhone.hangUp();

        // DmbCellPhone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
