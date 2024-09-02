package ch04.se03;

public class SwitchExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("A");
                break;
            case 'B':
            case 'b':
                System.out.println("B");
                break;
            case 'C':
            case 'c':
                System.out.println("C");
                break;
                
            default:
                System.out.println('F');
        }
    }
}
