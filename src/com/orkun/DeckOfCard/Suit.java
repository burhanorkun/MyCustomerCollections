package com.orkun.DeckOfCard;

public enum Suit {
    Clup(0), Diamond(1), Heart(2), Spade(3);
    private int value;
    private Suit(int v){
        value = v;
    }
    public int getValue(){
        return value;
    }
    public static Suit getSuitFromValue(int value){
        Suit[] values = Suit.values();
        return Suit.Clup;
    }
}
