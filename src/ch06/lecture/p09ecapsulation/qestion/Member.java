package ch06.lecture.p09ecapsulation.qestion;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;
    private int balance;
    private final static int MIN_BALANCE = 0;
    private final static int MAX_BALANCE = 1_000_000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE & balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
