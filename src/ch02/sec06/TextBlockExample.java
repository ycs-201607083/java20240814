package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str = "" +
                "[\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "]";

        String str2 = """
                {
                    "id" : "winter",
                    "name" : "눈송이"
                }
                """;

        System.out.println(str);
        System.out.println("--------------------------------------------------------------");
        System.out.println(str2);
        System.out.println("--------------------------------------------------------------");
        String str1 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;

        System.out.println(str1);
    }
}
