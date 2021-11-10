package bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        Stack st = new Stack();
        BraceChecker test = new BraceChecker("Hello { from (Java) ]");
        test.chack();
        System.err.println("Error: opened " + test.a + " but closed " + test.b);


    }

}
