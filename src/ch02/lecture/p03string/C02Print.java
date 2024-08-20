package ch02.lecture.p03string;

public class C02Print {
    public static void main(String[] args) {
        System.out.println("아령하세여.");
        System.out.print("아령하세연 ");
        System.out.println("자고싶어요");
        System.out.print("자고싶어요");
        System.out.println();
        System.out.printf("내 이름은 %s", "손흥민");
        System.out.println();
        String a = "이강인";
        System.out.printf("내 이름은 %s", a);

        String f = "이림은 %s";
        String name = "이이";
        String name2 = "22";
        System.out.println();
        System.out.printf(f, name);
        System.out.println();
        System.out.printf(f, name2);
        System.out.println();
        System.out.printf(f, name);
        System.out.println();
        System.out.printf("이름은 %s %n", "메시");
        System.out.printf("이름은 %s %n", "날두");

        System.out.printf("이름은 %s 나이는 %s살%n", "메시", "40");
        System.out.printf("30%%%n");
    }
}
