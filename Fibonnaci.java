
class Fibonnaci {
    public static int valueAt(int position) {
        if (position < 2) {
            return position;
        } else {
            return valueAt(position - 1) + valueAt(position - 2);
        }
    }

    public static void main(String args[]) {
        System.out.println("Fibonacci");
        System.out.println(" 0 - " + valueAt(0));
        System.out.println(" 1 - " + valueAt(1));
        System.out.println(" 2 - " + valueAt(2));
        System.out.println(" 3 - " + valueAt(3));
        System.out.println(" 4 - " + valueAt(4));
    }
}