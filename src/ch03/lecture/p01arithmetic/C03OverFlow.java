package ch03.lecture.p01arithmetic;

public class C03OverFlow {
    public static void main(String[] args) {
        //overflow :  허용된 범위를 넘게 되어 의도하지 않은 값을 갖게됨

        //허용범위
        int money = 0;      //-21억 ~ 21억
        money = money + 10_0000_0000;
        System.out.println("money = " + money);

        money = money + 10_0000_0000;
        System.out.println("money = " + money);

        //허용범위를 넘어감
        money = money + 10_0000_0000;
        System.out.println("money = " + money);
    }
}
