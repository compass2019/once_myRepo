package xuecheng.domain;

public class Noodle extends Food {

    //每天吃几次
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Noodle{" +
                "price=" + price +
                '}';
    }
}
