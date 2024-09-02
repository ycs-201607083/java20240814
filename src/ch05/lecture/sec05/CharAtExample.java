package ch05.lecture.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9704102354879";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1', '3' -> {
                System.out.println("남");
            }
            case '2', '4' -> {
                System.out.println("여");
            }
        }
    }
}
