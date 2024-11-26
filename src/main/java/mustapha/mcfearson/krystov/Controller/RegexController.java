package mustapha.mcfearson.krystov.Controller;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mustapha.mcfearson.krystov.Processor.RegexProcessor;

public class RegexController {
    @FXML
    private TextArea inputText, outputText;
    @FXML
    private TextField regexPattern, replacementText;

    private final RegexProcessor regexProcessor = new RegexProcessor();

    @FXML
    private void onSearch() {
        String text = inputText.getText();
        String pattern = regexPattern.getText();
        outputText.setText(regexProcessor.search(text, pattern));
    }

    @FXML
    private void onReplace() {
        String text = inputText.getText();
        String pattern = regexPattern.getText();
        String replacement = replacementText.getText();
        outputText.setText(regexProcessor.replace(text, pattern, replacement));
    }
}


