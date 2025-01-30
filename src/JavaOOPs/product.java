package JavaOOPs;

public class product {

    int pid, price, quantity;

    public product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + pid);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("____________________________________");
    }
}
