package ch06.lecture.p09ecapsulation.qestion;

public class Account {
    private String backNum;
    private String userName;
    private int initMoney;

    public Account(String backNum, String userName, int initMoney) {
        this.backNum = backNum;
        this.userName = userName;
        this.initMoney = initMoney;
    }


    public Account(int initMoney) {
        this.initMoney = initMoney;
    }

    public Account() {
    }

    public String getBackNum() {
        return backNum;
    }

    public void setBackNum(String backNum) {
        this.backNum = backNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(int initMoney) {
        this.initMoney = initMoney;
    }
}
