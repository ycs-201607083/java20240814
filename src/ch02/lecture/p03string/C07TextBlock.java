package ch02.lecture.p03string;

public class C07TextBlock {
    public static void main(String[] args) {
        String a = "동해물과 백두산이\n 마르고 닳도록\n";
        System.out.println("a = " + a);

        String b = "동해물과 백두산이\n " +
                "마르고 닳도록\n";
        System.out.println("b = " + b);

        String c = """
                동해물과 백두산이 
                마르고 닳도록
                """;

        System.out.println("c=" + c);

        String html1 = "<hrml1>\n" +
                "<head>\n" +
                "<body>\n" +
                "<title>\n" +
                "<head>\n";

        String s = """
                <hrml1> 
                                <head> 
                                <body>
                                <title> 
                                <head>
                """;

        System.out.println("html2=" + s);

    }
}
