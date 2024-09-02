package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCIpl impl = new InterfaceCIpl();

        InterfaceA ia = impl;
        ia.MA();
        InterfaceB ib = impl;
        ib.MB();
        InterfaceC ic = impl;
        ic.MA();
        ic.MB();
        ic.MC();
    }
}
