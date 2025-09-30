import java.util.*;

public class ShoppingList {
    private TreeMap<String, Integer> inventory = new TreeMap<>();
    private TreeMap<String, Integer> required = new TreeMap<>();
    private Scanner sc = new Scanner(System.in);

    public ShoppingList() {
        inventory.clear();
        required.clear();
    }

    private void addingTo(TreeMap<String, Integer> mapName, String name, int amount) {
        if (mapName.containsKey(name)) {
            int num = mapName.get(name);
            mapName.put(name, num + amount);
        } else {
            mapName.put(name, amount);
        }
    }



    public void read() {
        boolean isInventory = false;
        boolean isRequired = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("AVAILABLE")) {
                isInventory = true;
                isRequired = false;
                continue;
            } else if (line.startsWith("RECIPE")) {
                isInventory = false;
                isRequired = true;
                continue;
            }

            String[] details = line.split(" ");
            if (details.length < 3) {
                continue;
            }

            int amount = Integer.parseInt(details[0]);
            String unit = details[1];
            if (unit.equals("kg")) {
                amount *= 1000;
            } else if (!unit.equals("g")) { //this needs to be there unless the loop will stop at some point
                continue;
            }

            String name = details[2];

            if (isInventory) {
                addingTo(inventory, name, amount);
            } else if (isRequired) {
                addingTo(required, name, amount);
            }
        }

        for (String name : inventory.keySet()) {
            if ((required.getOrDefault(name, 0)) <= (inventory.get(name) )) {
                required.remove(name);
            } else {
                required.put(name, (required.getOrDefault(name, 0)) - (inventory.get(name) ));
            }
        }
    }



    public void printShoppingList() {
        System.out.println("Shopping List:");
        if (required.isEmpty()) {
            return;
        }

        for (String ingredient : required.keySet()) {
            int amount = required.get(ingredient);
            System.out.println(amount + " g " + ingredient);
        }
    }
    }