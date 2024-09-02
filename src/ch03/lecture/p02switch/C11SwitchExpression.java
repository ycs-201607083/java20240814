package ch03.lecture.p02switch;

public class C11SwitchExpression {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 3) + 1;

        String g = switch (n) {
            case 1 -> "일";
            case 2 -> "이";
            case 3 -> "삼";
            default -> "그 외";
        } + "등급";

        System.out.println(g + "등급");
    }
}
