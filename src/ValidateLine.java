import java.util.regex.Pattern;

/**
 * Created by VardhmanMehta on 23/07/15.
 */
public class ValidateLine {
    private static Pattern patternOne = Pattern.compile("[WizRocket[\\s]*handleOpenURL[\\s]*:[\\s]*url[\\s]*sourceApplication[\\s]*:[\\s]*[\\w]*[\\s]*][\\s]*;");
    private static Pattern patternTwo = Pattern.compile("[WizRocket[\\s]*handleNotificationWithData[\\s]*:[\\s]*[\\w]*[\\s]*][\\s]*;");
    private static Pattern patternThree = Pattern.compile("[WizRocket[\\s]*setPushToken[\\s]*:[\\s]*[\\w]*[\\s]*][\\s]*;");
    public void checkLines(String line) {

    }
}
