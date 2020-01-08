import java.util.Arrays;

public class Leet_1_ReverseString {
    public void reverseString(char[] s) {
        reverseHelper(0, s);
    }

    private void reverseHelper(int i, char[] s) {
        if (s == null || i >= (s.length + 1) / 2) {
            return;
        }

        reverseHelper(i + 1, s);

        char temp = s[i];
        s[i] = s[s.length - 1 - i];
        s[s.length - 1 - i] = temp;
    }

    public static void main(String[] args) {
        // prepare
        char[] testString = { 'a', 'b', 'c', 'd' };
        char[] cpyTestString = Arrays.copyOf(testString, testString.length);

        // run
        Leet_1_ReverseString sol = new Leet_1_ReverseString();
        sol.reverseString(testString);

        // print
        System.out.println("Reverse of " + String.valueOf(cpyTestString) + " is " + String.valueOf(testString));
    }
}