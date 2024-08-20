package ch02.sec12;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품 가격%d원\n", value);
        System.out.printf("상품 가격%6d원\n", value);
        System.out.printf("상품 가격%-6d원\n", value);
        System.out.printf("상품 가격%06d원\n", value);

        int radius = 5;
        double area = 3.14159 * radius * radius;
        System.out.printf("반지름이 %d인 원의 넓이%10.2f\n", radius, area);

        String name = "홍";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        

    }
}
