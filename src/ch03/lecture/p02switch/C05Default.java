package ch03.lecture.p02switch;

public class C05Default {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 11);

        switch (n) {
            case 1, 3, 5 -> {
                System.out.println("홀");
            }
            case 2, 4, 6 -> {
                System.out.println("짝");
            }
            default -> {
                System.out.println("ddd");
            }
        }

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
                System.out.println("ddd");
                break;

        }
    }
}
