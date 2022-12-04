package duke.choice;

public class ShopApp {
    public ShopApp() {
    }

    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        Customer c1 = new Customer();
        Clothing item1 = new Clothing("Blue Jacket", 20.9,"M" );
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        total = (1 * item1.price + 2 * item2.price) * (1 + tax);
        System.out.println("The total you need to pay is " + total);

        c1.name = "Pinky";
        System.out.println("Hi " + c1.name + ", Welcome to Duke Choice Shop!");
        System.out.println("Item 1" + ", " + item1.description + ", " + item1.size + ", " + item1.price);
        System.out.println("Item 2" + ", " + item2.description + ", " + item2.size + ", " + item2.price);


    }

}
