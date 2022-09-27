import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;
    Set<String> setWords = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] arrayWords = getText().split("\\P{IsAlphabetic}+");
        for (String words : arrayWords) {
            setWords.add(words);
        }

    }

    public String getText() {
        return text.toLowerCase();
    }

    public boolean hasWord(String text) {
        if (setWords.contains(text)) {
            return true;
        }
        return false;
    }
}
