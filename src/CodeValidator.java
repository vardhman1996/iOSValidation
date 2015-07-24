import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by VardhmanMehta on 23/07/15.
 */
public class CodeValidator {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/VardhmanMehta/Desktop/testXCode/testCode/testCode/AppDelegate.m");
        Scanner scanner = new Scanner(file);
        ValidateLine validateLine = new ValidateLine();
        while(scanner.hasNextLine()) {
            validateLine.checkLines(scanner.nextLine());
        }

        if(validateLine.isGotRequiredPattern()) {
            System.out.println("[  PASS  ] WizRocket notification call found");
        } else {
            System.out.println("[  FAIL  ] WizRocket notification call not found");
        }

        if(validateLine.isGotPatternOne()) {
            System.out.println("[  PASS  ] Deep Link handled correctly");
        } else {
            System.out.println("[  FAIL  ] Deep Link not handled correctly");
        }

        if(validateLine.isGotPatternThree()) {
            System.out.println("[  PASS  ] Push Notification support call found");
        } else {
            System.out.println("[  FAIL  ] Push Notification support call not found");
        }

        if(validateLine.isGotPatternTwo()) {
            System.out.println("[  PASS  ] Push Notification extras call found");
        } else {
            System.out.println("[  FAIL  ] Push Notification extras call not found");
        }
    }
}
