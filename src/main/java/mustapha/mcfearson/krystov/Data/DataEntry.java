package mustapha.mcfearson.krystov.Data;

import java.util.Objects;

public class DataEntry {
    private String key;
    private String value;

    public DataEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataEntry dataEntry = (DataEntry) o;
        return Objects.equals(key, dataEntry.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
