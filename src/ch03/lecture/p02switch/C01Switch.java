package ch03.lecture.p02switch;

public class C01Switch {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;

        switch (n) {
            case 3 -> {
                System.out.println(3);
            }
            case 2 -> {
                System.out.println(2);
            }
            case 1 -> {
                System.out.println(1);
            }
        }
    }
}
