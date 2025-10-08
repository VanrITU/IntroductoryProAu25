import java.util.List;

public class Food {
    protected String name;
    protected int price;

    public Food(String name, int price) {

    }

    public void getPrice() {
        //must return the price
    }

    public void display() {
        // must print <print> kr <name> where <Price> is the price of the food item and <name> is its name
    }

}

public class Pizza extends Food {
    protected List<String> toppings;

    public Pizza() {

    }

    public void addTopping(String toppings) {

    }

    public void setName(String name) {

    }
}