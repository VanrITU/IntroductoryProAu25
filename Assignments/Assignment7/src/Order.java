import java.util.ArrayList;
import java.util.List;

public class Order {
    protected List<Food> ordered;

    public Order() {
        this.ordered = new ArrayList<>();
    }

    public void addFood(Food food) {
        this.ordered.add(food);
    }

    public int total() {
        int total = 0;
        for (Food item : this.ordered) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        for (Food item : this.ordered) {
            item.display();
        }
        System.out.println(this.total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card) {
        int amount = this.total();
        if (card.withdraw(amount)) {
            return card.withdraw(this.total());
        } else {
            System.out.println("ERROR: Payment failed");
            return card.withdraw(this.total());
        }
    }

}
