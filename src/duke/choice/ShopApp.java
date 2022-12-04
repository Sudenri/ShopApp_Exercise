package duke.choice;

public class ShopApp {
    public ShopApp() {
    }

    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        int measurement = 3;

        Customer c1 = new Customer();
        c1.size = "S";
        c1.name = "Pinky";

        Clothing item1 = new Clothing("Blue Jacket", 20.9,"M" );
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        total = (1 * item1.price + 2 * item2.price) * (1 + tax);



        System.out.println("Hi " + c1.name + ", Welcome to Duke Choice Shop!");
        System.out.println("Item 1" + ", " + item1.description + ", " + item1.size + ", " + item1.price);
        System.out.println("Item 2" + ", " + item2.description + ", " + item2.size + ", " + item2.price);
        System.out.println("The total you need to pay is " + total);

        switch (measurement) {
            case 1, 2, 3 :
                c1.size = "S";
                break;
            case 4, 5, 6 :
                c1.size = "M";
                break;
            case 7, 8, 9 :
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

    }

}
