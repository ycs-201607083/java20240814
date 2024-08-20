package ch02.sec07;

import com.sun.jdi.CharValue;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;

        System.out.println("가 = " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue);
    }
}
