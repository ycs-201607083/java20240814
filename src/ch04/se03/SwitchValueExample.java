package ch04.se03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "b";

        int score = 0;
        switch (grade) {
            case "A":
                score = 100;
                break;
            case "B":
                int result = 100 - 2;
                score = result;
                break;
            default:
                score = 60;
        }
        System.out.println("score = " + score);

        switch (grade) {
            case "A" -> score -= 100;
            case "B" -> {
                int result = 100 - 20;

            }
            default -> score = 60;
        }
        System.out.println("score = " + score);
    }
}

