package hellopackages;

public enum Suit {
    Club(0), Diamond(1), Heart(2), Spade(3);

    int value;

    private Suit(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }
}
