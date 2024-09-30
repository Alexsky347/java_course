package inheritance;

public class ProtectedTest {
    public void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(25);
    }

    protected void notAllowedOutsidePackage() {
        System.out.println("This method is protected and cannot be accessed outside the package");
    }
}
