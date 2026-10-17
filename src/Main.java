public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        System.out.println(expandText(text));
    }

    public static String expandText(String text) {
        int size = text.length();
        char[] charsOfText = text.toCharArray();
        int left = 0;
        int right = size - 1;
        while (left < right) {
            char tmp = charsOfText[left];
            if (!Character.isLetter(charsOfText[left])) {
                left++;
            } else if (!Character.isLetter(charsOfText[right])) {
                right--;
            } else {
                charsOfText[left] = charsOfText[right];
                charsOfText[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(charsOfText);
    }
}
