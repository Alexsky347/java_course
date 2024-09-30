package records;

public class AccountFactory {
    public void setAccount(){
        Account account = new Account(1, 1, "checking", 100.0);
        System.out.println(account);

//        account.setTpe("savings"); // gives compilation errors

        double balance = account.balance();
    }
}
