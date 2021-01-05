package xuecheng.domain;

public class Rice extends Food {

    //烹饪方法
    private String way;

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return "Rice{" +
                "way='" + way + '\'' +
                '}';
    }
}
