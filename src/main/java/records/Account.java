package records;

public record Account (int id,
                       int customerId,
                       String type,
                       double balance
){
    public void addedMethod(){
        System.out.println("This is a static method");
    }

}
