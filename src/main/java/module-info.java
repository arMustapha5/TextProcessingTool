module org.amalitech.demo {
    requires javafx.controls;
    requires javafx.fxml;

    // Export application entry-point package
    exports mustapha.mcfearson.krystov;

    // Open packages for reflection by JavaFX FXMLLoader
    opens mustapha.mcfearson.krystov to javafx.graphics;
    opens mustapha.mcfearson.krystov.Controller to javafx.fxml;

    // Optional: Open additional packages if required for reflection
    opens mustapha.mcfearson.krystov.Processor to javafx.fxml;
    //opens org.amalitech.demo.Data to javafx.fxml;
    opens mustapha.mcfearson.krystov.Data to javafx.base;

}
