package ch06.lecture.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer a = new Computer();

        int result1 = a.sum(1, 2, 3);
        System.out.println("result1 = " + result1);

        int result2 = a.sum(1, 2, 3, 4, 5);
        System.out.println("result2 = " + result2);

        int value[] = {1, 2, 3, 4, 5};
        int result3 = a.sum(value);
        System.out.println("result3 = " + result3);

        int result4 = a.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4 = " + result4);
    }
}
