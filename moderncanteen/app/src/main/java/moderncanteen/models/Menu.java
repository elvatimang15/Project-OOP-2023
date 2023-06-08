package moderncanteen.models;

public class Menu {
    private String name;
    public int price;
    private int makerTime;
    private int itemCount = 0;

    public Menu(String name, int price, int makerTime) {
        this.name = name;
        this.price = price;
        this.makerTime = makerTime;
    }

    public int getMakerTime() {
        return makerTime * itemCount * 60;
    }

    public void setMakerTime(int makerTime) {
        this.makerTime = makerTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price * itemCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addItem() {
        this.itemCount++;
    }

    public void reduceItem() {
        if (itemCount <= 0) {
            itemCount = 0;
        } else {
            this.itemCount--;
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
