package mustapha.mcfearson.krystov.Processor;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProcessor {
    public String search(String text, String pattern) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);
        StringBuilder matches = new StringBuilder("Matches:\n");

        while (matcher.find()) {
            matches.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }

        return matches.toString();
    }

    public String replace(String text, String pattern, String replacement) {
        return text.replaceAll(pattern, replacement);
    }
}
