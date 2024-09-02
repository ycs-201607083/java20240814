package ch06.execise;

public class MemberService {
    String id;
    String password;

    public boolean login(String id, String password) {
        this.id = id;
        this.password = password;

        if (id.equals("hong") & password.equals("12345")) {
            System.out.println("로그인 되었습니다.");
            return true;
        }
        System.out.println("틀림");
        return false;
    }

    public void logout() {
        System.out.println(id + "님이 로그아웃 하였습니다.");
    }

    public void println(int i) {
        System.out.println(i);
    }

    public void println(boolean b) {
        System.out.println(b);
    }

    public void println(double d) {
        System.out.println(d);
    }

    public void println(String s) {
        System.out.println(s);
    }


}
