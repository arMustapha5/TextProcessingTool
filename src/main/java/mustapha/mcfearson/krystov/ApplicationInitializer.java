package mustapha.mcfearson.krystov;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationInitializer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/main-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("KRYStov Text Processing & Data Management Tool");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}