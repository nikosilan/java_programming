
public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
    }


    public String search(String word) {

        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word!";
        }

        try {
            return dictionary.searchWord(word.trim());
        } catch (IllegalArgumentException e) {
            return "Word not found in the dictionary!";
        }
    }
}
