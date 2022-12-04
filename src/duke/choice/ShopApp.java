package duke.choice;

public class ShopApp {
    public ShopApp() {
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Hi " + c1.name.toString() + ", Welcome to Duke Choice Shop!");
    }
}
