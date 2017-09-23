package cn.chyson.domain;

/**
 * Created with IntelliJ IDEA.
 * Author: Ashin
 * Date: 17/9/23
 * Time: 15:58
 */
public class Student {
    private int sid;
    private String sName;
    private String sSex;
    private String sAge;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsAge() {
        return sAge;
    }

    public void setsAge(String sAge) {
        this.sAge = sAge;
    }
}
