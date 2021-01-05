package xuecheng.domain;

public class TmpCourseView {

    private Integer sid;
    private Integer shuxue;
    private Integer yuwen;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getShuxue() {
        return shuxue;
    }

    public void setShuxue(Integer shuxue) {
        this.shuxue = shuxue;
    }

    public Integer getYuwen() {
        return yuwen;
    }

    public void setYuwen(Integer yuwen) {
        this.yuwen = yuwen;
    }

    @Override
    public String toString() {
        return "TmpCourseViem{" +
                "sid=" + sid +
                ", shuxue=" + shuxue +
                ", yuwen=" + yuwen +
                '}';
    }
}
