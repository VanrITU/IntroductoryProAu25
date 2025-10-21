import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    protected List<String> toppings;


    public Pizza() {
        super("Pizza", 45);
        this.toppings = new ArrayList<>();

    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
        super.price += 10;
    }

    public void setName(String newName) {
        super.name = newName;
    }

    //override display()
    @Override public void display() {
        System.out.print(this.price + " kr " + this.name + " { ");

        if (this.toppings.isEmpty()) {
            System.out.print("}\n");
        }  else {
            for (int i = 0; i < this.toppings.size(); i++) {
                System.out.print(this.toppings.get(i));
                if (i == this.toppings.size() - 1) {
                    System.out.print(" }\n");
                } else {
                    System.out.print(", ");
                }
            }
        }


    }


 else

}
