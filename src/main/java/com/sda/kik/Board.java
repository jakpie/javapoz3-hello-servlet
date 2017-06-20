package com.sda.kik;

import java.util.Arrays;

/**
 * Created by Szymon on 2017-06-20.
 */
public class Board {
    //tablica String[]
    //konstruktor tworzacy pusta tablice
    //metoda void addMove(int position, char sign)
    //toString ->
    //1|2|3
    //X|O|6
    //O|X|9
    private String[] array;

    public Board() {
        array = new String[9];
    }

    /**
     * @param position values(1-9)
     */
    public boolean addMove(int position, String sign) {
        boolean valueToReturn = false;
        if (checkRange(position) && isPositionEmpty(position)) {
            array[position - 1] = sign;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    private boolean checkRange(int position) {
        return (position > 0 && position < 10);
    }

    private boolean isPositionEmpty(int position) {
        return array[position - 1] == null;
    }

    //1|2|3
    //X|O|6
    //O|X|9
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < array.length; i++) {
            stringBuilder.append(array[i] == null ? (i + 1) : array[i]);
            stringBuilder.append((i + 1) % 3 == 0 ? "\n" : "|");
        }
        return stringBuilder.toString();
    }
}



















