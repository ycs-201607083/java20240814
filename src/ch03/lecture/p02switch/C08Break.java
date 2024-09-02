package ch03.lecture.p02switch;

public class C08Break {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 4);

        switch (n) {
            case 1:
                System.out.println("첫째");
                break;
            case 2:
                System.out.println("2째");
                break;
            case 3:
                System.out.println("3째");
                break;
        }
    }
}
