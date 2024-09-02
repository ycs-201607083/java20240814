package ch03.lecture.p02switch;

public class C04Switch {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 7);

        switch (n) {
            case 1:
            case 3:
            case 5:
                System.out.println("홀");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝");
                break;

            default:
                System.out.println("s");
        }
    }
}
