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
    }
}
