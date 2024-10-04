package interfaces;

public class Grocery implements Product, Worker {
    private String name;
    private double price;
    private int quantity;

    public Grocery(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void createProduct() {
        System.out.println("Creating grocery product");
    }

    @Override
    public void shipProduct() {
        System.out.println("Shipping grocery product");
    }

    @Override
    public void billProduct() {
        System.out.println("Billing grocery product");
    }

    public void display() {
        System.out.println("Displaying grocery product");
    }

    @Override
    public void doWork() {
        System.out.println("Working at grocery store");
    }

    @Override
    public void lunchBreak() {
        System.out.println("Taking lunch break");
    }

    @Override
    public void clockOut() {
        System.out.println("Clocking out");
    }

    @Override
    public String getSomeValue() {
        return "Some value";
    }

    // default method no needs to be implemented
    // but can be overridden
//    @Override
//    public String getWorkerType() {
//        return this.name;
//    }
}
