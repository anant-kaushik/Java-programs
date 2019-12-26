class Solution {
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
}

class TestCase {
    public static void main(String[] args) {
        // prepare
        char[] testString = { 'a', 'b', 'c', 'd' };

        // run
        Solution sol = new Solution();
        sol.reverseString(testString);

        // print
        System.out.println("Reverse of abcd is " + String.valueOf(testString));
    }
}