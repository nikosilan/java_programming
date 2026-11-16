
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private Map<String, String> words;

    public Dictionary() {
        words = new HashMap<>();


        words.put("apple", "omena");
        words.put("book", "kirja");
        words.put("computer", "tietokone");
        words.put("house", "talo");
        words.put("school", "koulu");
        words.put("car", "auto");
        words.put("water", "vesi");
        words.put("hello", "hei");
        words.put("dog", "koira");
        words.put("cat", "kissa");
    }


    public void addWord(String word, String meaning) {
        words.put(word.toLowerCase(), meaning);
    }


    public String searchWord(String word) {
        String meaning = words.get(word.toLowerCase());

        if (meaning == null) {
            throw new IllegalArgumentException("Word not found!");
        }

        return meaning;
    }
}
