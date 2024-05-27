package cards;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private final int value;

    CardSuit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
