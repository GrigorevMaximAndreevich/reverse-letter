import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {

    private final Reverse reverse = new Reverse();

    @Test
    void expandText_shouldReturnReverseOnlyLettersWithoutNumbersAndSigns() {
        String result = reverse.expandText("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void expandText_shouldReturnEmptyText() {
        Assertions.assertEquals("", reverse.expandText(""));
    }

    @Test
    void expandText_shouldReturnSingleLetter() {
        Assertions.assertEquals("a", reverse.expandText("a"));
    }

    @Test
    void expandText_shouldNotReverseLetters() {
        Assertions.assertEquals("123 !@#", reverse.expandText("123 !@#"));
    }

    @Test
    void expandText_shouldReverseLetters() {
        Assertions.assertEquals("abcd", reverse.expandText("dcba"));
    }

    @Test
    void expandText_shouldStaySingAndNumbersAtSamePosition() {
        String result = reverse.expandText("J@va1");
        Assertions.assertEquals('a', result.charAt(1));
        Assertions.assertEquals('1', result.charAt(result.length() - 1));
    }

    @Test
    void expandText_shouldReversLettersWithRegister() {
        String result = reverse.expandText("SuPeR");
        Assertions.assertEquals('S', result.charAt(result.length() - 1));
        Assertions.assertEquals('e', result.charAt(1));
    }

    @Test
    void expandText_shouldReturnEmptyTextIfTextIsNull() {
        String result = reverse.expandText(null);
        Assertions.assertEquals("", result);
    }
}
