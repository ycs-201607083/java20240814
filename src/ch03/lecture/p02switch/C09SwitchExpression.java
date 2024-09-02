package ch03.lecture.p02switch;

public class C09SwitchExpression {
    public static void main(String[] args) {
        String message = "";
        String grade = "A";

        switch (grade) {
            case "A", "a" -> {
                message = "우수등급";
            }
            case "B", "b" -> {
                message = "일반등급";
            }
            case "C", "c" -> {
                message = "등급미만";
            }
        }
        System.out.println(message);
    }
}
