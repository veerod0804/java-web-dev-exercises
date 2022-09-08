package Studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String term = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//switch term to array of chars
        char[] termArray = term.toCharArray();
        HashMap<Character, Integer> countingCharacters = new HashMap<>();
        Integer i = 1;

        //loop through string one character at a time and print the results

        for (char c : termArray) {
            if (countingCharacters.containsKey(c)) {
                countingCharacters.put(c, countingCharacters.get(c) + 1);
            } else {countingCharacters.put(c, i);
            }
        }

        for (Map.Entry<Character, Integer> c: countingCharacters.entrySet()) {
            i += c.getValue();
            }
            System.out.println(countingCharacters);
        }
    }
