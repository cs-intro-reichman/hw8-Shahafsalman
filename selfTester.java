public class selfTester {
    public static void main(String[] args) {
        System.out.println("...Testing the User class...\n");

        System.out.println("...To get started, creating a dummy user for testing the toString and follows methods...\n");
        User dummy = new User("Dummy", true);
        System.out.println(dummy);
        System.out.println("Dummy follows Bar: " + dummy.follows("Bar"));
        System.out.println("Dummy follows Gil: " + dummy.follows("Gil"));
    }

    
}
