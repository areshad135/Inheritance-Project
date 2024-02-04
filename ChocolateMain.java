// Parent class
class Chocolate {
    String brand;
    double price;

    // Constructor for Chocolate class
    Chocolate(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display information about chocolate
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

// Child classes inheriting from Chocolate
class Hersheys extends Chocolate {
    String flavor;

    // Constructor for Hersheys class
    Hersheys(String brand, double price, String flavor) {
        super(brand, price);
        this.flavor = flavor;
    }

    // Overriding the displayInfo method from the parent class
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Flavor: " + flavor);
    }
}

class Twix extends Chocolate {
    int pieces;

    // Constructor for Twix class
    Twix(String brand, double price, int pieces) {
        super(brand, price);
        this.pieces = pieces;
    }

    // Overriding the displayInfo method from the parent class
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Pieces: " + pieces);
    }
}

class KitKat extends Chocolate {
    String size;

    // Constructor for KitKat class
    KitKat(String brand, double price, String size) {
        super(brand, price);
        this.size = size;
    }

    // Overriding the displayInfo method from the parent class
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}

class DairyMilk extends Chocolate {
    String type;

    // Constructor for DairyMilk class
    DairyMilk(String brand, double price, String type) {
        super(brand, price);
        this.type = type;
    }

    // Overriding the displayInfo method from the parent class
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

// Main class
public class ChocolateMain {
    public static void main(String[] args) {
        // Creating objects of different chocolate types
        Hersheys hersheys = new Hersheys("Hershey's", 2.99, "Milk Chocolate");
        Twix twix = new Twix("Twix", 1.49, 2);
        KitKat kitKat = new KitKat("KitKat", 1.99, "Regular");
        DairyMilk dairyMilk = new DairyMilk("Dairy Milk", 3.49, "Charamel");

        // Displaying information about chocolates
        System.out.println("Hershey's:");
        hersheys.displayInfo();

        System.out.println("\nTwix:");
        twix.displayInfo();

        System.out.println("\nKitKat:");
        kitKat.displayInfo();

        System.out.println("\nDairy Milk:");
        dairyMilk.displayInfo();
    }
}
