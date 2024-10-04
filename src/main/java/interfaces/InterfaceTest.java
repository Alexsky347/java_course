package interfaces;

public class InterfaceTest {
    public static void main(String[] args) {
        Grocery grocery = new Grocery("Apple", 1.99 , 5);
        grocery.createProduct();
        grocery.shipProduct();
        grocery.billProduct();
        grocery.display();
        grocery.doWork();
        grocery.lunchBreak();
        grocery.clockOut();

        // same method in both interfaces
        // because same signature
        // signature = method name + parameter list
        // implments one will work

        //if String getSize() && int getSize() then error
        // because return type is different
        System.out.println(grocery.getSomeValue());
        // default method no needs to be implemented
        System.out.println(grocery.getWorkerType());
    }
}
