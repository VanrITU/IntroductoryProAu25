import java.util.List;

public class Food {
    protected String name;
    protected int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        //must return the price
        return this.price;
    }

    public void display() {
        // must print <print> kr <name> where <Price> is the price of the food item and <name> is its name
        System.out.println(this.price + " kr " + this.name);

    }

}

