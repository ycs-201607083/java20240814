package ch02.lecture.p03string;

public class C08Template {
    public static void main(String[] args) {
        String name = "흥";
        int age = 33;

        String a = "이름은 " + name + ", 나이는 " + age;
        System.out.println(a);
        System.out.printf("이름은 %s, 나이는 %d", name, age);

        String title = "내 웹페이지";
        String heading = "웹 페이지 제목";
        String para = "웹 페이지 내용";

        String html1 = """
                <html>
                    <head>
                        <title>"""
                + title + """
                </title>
                </head>
                <body>
                <h1> """
                + heading + """
                </h1>
                <p>"""
                + para + """
                </p>
                </body>
                <html>
                """;
    }
}
