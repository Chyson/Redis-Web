package cn.chyson.domain;

/**
 * Created with IntelliJ IDEA.
 * Author: Ashin
 * Date: 17/9/23
 * Time: 15:44
 */
public class Person {
    private int id;
    private String userName;
    private String passWord;

    public Person() {
    }

    public Person(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
