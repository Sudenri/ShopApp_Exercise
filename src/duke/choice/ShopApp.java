package duke.choice;

public class ShopApp {
    public ShopApp() {
    }

    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 3;

        Customer c1 = new Customer();
        c1.size = "S";
        c1.name = "Pinky";

        Clothing item1 = new Clothing("Blue Jacket", 20.9,"M" );
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-shirt", 10.5, "S");
        Clothing[] items = {item1, item2, item3, item4};

        System.out.println("Hi " + c1.name + ", Welcome to Duke Choice Shop!");

        for(Clothing item: items){
           if(item.size == c1.size){
               System.out.println("The selected item that fits the customer is a " + item.description + "of size " + "and costs " + item.price);
               total = total + item.price + item.price * tax;
               if (total > 15){
                   break;
               }
            }
        }

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
