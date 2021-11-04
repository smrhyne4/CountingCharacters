import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {


    public CharacterCounter() {

    }

    public void countCharacters(String wordToCount) {
        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {

            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                myCharacterCount.put(theCharacter, 1);

            } else {
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }

        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for(int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }

}