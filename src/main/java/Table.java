public class Table {
    private boolean available;
    private String reservedName;

    public Table() {
        this.available = true;
        reservedName = "";
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean availability) {
        this.available = availability;
    }

    public String getName() {
        return reservedName;
    }

    public void setName(String name) {
        this.reservedName = name;
    }

    public void clearTable() {
        available = true;
        reservedName = "";
    }

    @Override
    public String toString() {
        return reservedName;
    }
}
