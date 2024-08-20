package ch03.sec06;

public class CompareOperationExample {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 10;

        boolean result1 = (num == num2);
        boolean result2 = (num != num2);
        boolean result3 = (num <= num2);

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);

        char ch1 = 'A';
        char ch2 = 'B';
        boolean result4 = (ch1 < ch2);

        System.out.println("result4=" + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5=" + result5);

        float num5 = 0.1f;
        double num6 = 0.1f;

        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float) num6);

        System.out.println("result6=" + result6);
        System.out.println("result7=" + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str2.equals(str2));

        System.out.println("result8=" + result8);
        System.out.println("result9=" + result9);
    }
}
