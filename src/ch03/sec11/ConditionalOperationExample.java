package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "급 입니다");

        int a = 356;


        a -= 56;
        System.out.println(a);


    }
}
