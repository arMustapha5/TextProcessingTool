package mustapha.mcfearson.krystov.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import mustapha.mcfearson.krystov.Data.DataEntry;
import mustapha.mcfearson.krystov.Data.DataManager;

public class DataController {
    @FXML
    private TextField keyField, valueField;
    @FXML
    private TableView<DataEntry> tableView;
    @FXML
    private TableColumn<DataEntry, String> keyColumn, valueColumn;

    private final DataManager dataManager = new DataManager();
    private final ObservableList<DataEntry> tableData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        keyColumn.setCellValueFactory(new PropertyValueFactory<>("key"));
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
        tableView.setItems(tableData);
    }

    @FXML
    private void onAdd() {
        DataEntry entry = new DataEntry(keyField.getText(), valueField.getText());
        dataManager.addEntry(entry);
        tableData.setAll(dataManager.getEntries());
    }

    @FXML
    private void onDelete() {
        String key = keyField.getText();
        dataManager.deleteEntry(key);
        tableData.setAll(dataManager.getEntries());
    }
    @FXML
    private  void  onUpdate() {
        String key= keyField.getText();
        String value= valueField.getText();
        dataManager.updateEntry(key,value);
        tableData.setAll(dataManager.getEntries());
    }
}
