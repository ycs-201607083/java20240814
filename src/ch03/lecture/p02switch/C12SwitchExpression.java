package ch03.lecture.p02switch;

public class C12SwitchExpression {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 4);

        String g = switch (n) {
            case 1 -> "일";
            case 2 -> {
                String a = "이";
                String b = "등급";
                yield a + b;
            }
            case 3 -> "삼";
            default -> "";
        };

        System.out.println(g);
    }
}
