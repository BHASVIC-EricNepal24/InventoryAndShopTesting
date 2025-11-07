import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> inventory = new HashMap<String, Integer>();

    public Inventory() {
        inventory.put("Compost", 0); // Hunger, happiness
        inventory.put("Tennis ball", 0); // Happiness, boredom
        inventory.put("Greenhouse time", 0); // All
        inventory.put("Soap", 0); // Hygiene, happiness
    }

    public int getCompost() {
        return inventory.get("Compost");
    }

    public int getTennisBall() {
        return inventory.get("Tennis ball");
    }

    public int getGreenhouseTime() {
        return inventory.get("Greenhouse time");
    }

    public int getSoap() {
        return inventory.get("Soap");
    }

    public void decrementInventory(String key) {
        int decrementedValue = inventory.get(key) - 1;
        inventory.replace(key, decrementedValue);
    }

    public void useItem(String key) {
        if (inventory.get(key) < 1) {
            System.out.println("Not enough " + key);
        } else {
            decrementInventory(key);
            System.out.println("Pet has used: " + key);
        }

    }


}
