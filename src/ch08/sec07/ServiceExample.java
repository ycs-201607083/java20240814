package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        //디폴트 메소드 호출
        service.defaultM1();
        System.out.println();
        service.defaultM2();
        System.out.println();

        //정적 메서드 호출
        Service.staticM1();
        System.out.println();
        Service.staticM2();
        System.out.println();

    }
}
