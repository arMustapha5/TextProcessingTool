package mustapha.mcfearson.krystov.Data;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final List<DataEntry> entries = new ArrayList<>();

    public void addEntry(DataEntry entry) {
        entries.add(entry);
    }

    public void updateEntry(String key, String newValue) {
        for (DataEntry entry : entries) {
            if (entry.getKey().equals(key)) {
                entry.setValue(newValue);
                break;
            }
        }
    }

    public void deleteEntry(String key) {
        entries.removeIf(entry -> entry.getKey().equals(key));
    }

    public List<DataEntry> getEntries() {
        return new ArrayList<>(entries);
    }
}
