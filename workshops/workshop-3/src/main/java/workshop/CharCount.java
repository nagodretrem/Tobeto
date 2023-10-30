package workshop;

import java.util.HashMap;

public class CharCount {
    public void characterCount(String text){
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();

        text = text.toLowerCase();

        for (char ch : text.toCharArray()){
            if(characters.containsKey(ch)){
                characters.put(ch, characters.get(ch)+1);
            }else {
            characters.put(ch,1);
            }
        }

        System.out.println(characters);
    }
}
