package chapter07.sec01.exam06;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    /*
    Car 클래스의 stop() 메소드를 final로 선언했기 때문에
    Car를 상속한 SportsCar 클래스에서 stop() 메소드를 재정의할 수 없음

    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */

}
