package com.javarush.cryptanalyzer.pozharitskaya.constans.encryption;

import java.util.ArrayList;
import java.util.List;
import static com.javarush.cryptanalyzer.pozharitskaya.constans.Constants.CryptoAlphabet.ALPHABET;

public class EnumerationAlphabet {


    private int EnumerationAlphabet() {
        List<Character> alphabet = new ArrayList<>();
        int numberOfLetters = ALPHABET.length();
        for (int i = 0; i < ALPHABET.length(); i++) {

            char symbol = ALPHABET.charAt(i);
            alphabet.add(symbol);
        }
        int numberChar = 0;
        for (char chars : alphabet) {
            numberChar = alphabet.indexOf(chars);
            while (true) {
                if (0 < numberChar) break;
            }
        }
        return numberChar;
    }
}
