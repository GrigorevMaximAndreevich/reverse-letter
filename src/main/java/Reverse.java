public class Reverse {
    public String expandText(String text) {
        if (text == null || text.isEmpty()) {
            text = "";
        }
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
