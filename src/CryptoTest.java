package src;

import java.util.HashMap;

public class CryptoTest {
    HashMap<Integer, Character> alphabet = new HashMap<Integer, Character>();

    public void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int i = (int) ch;
        }
        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            alphabet.put(i,ch);
        }

        CryptoIn();
    }
    public static String CryptoIn()
    {
return "AA";
    }

    public static String CryptoOut()
    {
return "BB";
    }


}
