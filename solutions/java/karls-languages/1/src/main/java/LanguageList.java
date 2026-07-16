import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();


    public boolean isEmpty() {
        return true;
    }

    public void addLanguage(String language) {
        LanguageList.add(language);
    }

    public void removeLanguage(String language) {
        LanguageList.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return language.contains();
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
