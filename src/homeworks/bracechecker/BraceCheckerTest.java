package homeworks.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker checkFirstText = new BraceChecker("Hello from [Java]");
        checkFirstText.check();
        BraceChecker checkSecondText = new BraceChecker("Hello from [Java}");
        checkSecondText.check();
        BraceChecker checkThirdText = new BraceChecker("Hello from [Java");
        checkThirdText.check();
        BraceChecker checkFourthText = new BraceChecker(" ");
        checkFourthText.check();

    }
}