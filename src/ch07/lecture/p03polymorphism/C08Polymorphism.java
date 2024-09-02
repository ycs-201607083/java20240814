package ch07.lecture.p03polymorphism;

public class C08Polymorphism {
    public static void main(String[] args) {
        Fish08 f = new Fish08();
        Bear08 b = new Bear08();
        living(f);

    }

    public static void living(Animal8 a) {
        a.breathe();

    }
}
