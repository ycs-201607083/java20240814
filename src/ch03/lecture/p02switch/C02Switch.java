package ch03.lecture.p02switch;

public class C02Switch {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 7);

        switch (n) {
            case 1, 3, 5 -> {
                System.out.println("홀");
            }
            case 2, 4, 6 -> {
                System.out.println("짝");
            }


        }
    }
}
