import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by VardhmanMehta on 23/07/15.
 */
public class ValidateLine {
    private static Pattern requiredPattern = Pattern.compile("\\[WizRocket[\\s]*notifyApplicationLaunchedWithOptions[\\s]*:[\\s]*[\\w]*[\\s]*\\][\\s]*;");
    private static Pattern patternOne = Pattern.compile("\\[WizRocket[\\s]*handleOpenURL[\\s]*:[\\s]*url[\\s]*sourceApplication[\\s]*:[\\s]*[\\w]*[\\s]*\\][\\s]*;");
    private static Pattern patternTwo = Pattern.compile("\\[WizRocket[\\s]*handleNotificationWithData[\\s]*:[\\s]*[\\w]*[\\s]*\\][\\s]*;");
    private static Pattern patternThree = Pattern.compile("\\[WizRocket[\\s]*setPushToken[\\s]*:[\\s]*[\\w]*[\\s]*\\][\\s]*;");

    private boolean gotRequiredPattern = false;
    private boolean gotPatternOne = false;
    private boolean gotPatternTwo = false;
    private boolean gotPatternThree = false;

    private int count = 0;

    public void checkLines(String line) {
        Matcher m;
        m = requiredPattern.matcher(line);
        if (m.find()) {
            gotRequiredPattern = true;
        }

        m.reset();

        m = patternOne.matcher(line);
        if (m.find()) {
            gotPatternOne = true;
        }

        m.reset();

        m = patternThree.matcher(line);
        if (m.find()) {
            gotPatternThree = true;
        }

        m.reset();

        m = patternTwo.matcher(line);
        if (m.find()) {
            count++;
            if (count == 4) {
                gotPatternTwo = true;
            }
        }
    }

    public boolean isGotRequiredPattern() {
        return gotRequiredPattern;
    }

    public boolean isGotPatternOne() {
        return gotPatternOne;
    }

    public boolean isGotPatternTwo() {
        return gotPatternTwo;
    }

    public boolean isGotPatternThree() {
        return gotPatternThree;
    }

}
