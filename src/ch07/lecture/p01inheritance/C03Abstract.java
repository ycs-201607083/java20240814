package ch07.lecture.p01inheritance;

import java.math.BigDecimal;

public class C03Abstract {
    public static void main(String[] args) {
        Number n = new Integer(3);
        Number s = new Double(3.14);
        Number na = new BigDecimal(3.1415);

        Double v = n.doubleValue();
        Double v1 = s.doubleValue();
        Double v2 = na.doubleValue();

        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
    }
}
