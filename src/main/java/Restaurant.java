import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Restaurant {
    ArrayList<Table> tables = new ArrayList<>();
    LinkedList<String> waitList = new LinkedList<>();

    public Restaurant() {
        tables.add(new Table());
        tables.add(new Table());
    }

    public LinkedList<String> getWaitList() {
        return waitList;
    }

    public void addToWaitList(String name) {
        waitList.add(name);
        System.out.println(name + " has been added to waitlist.");
    }

    public void checkIn(String name) {
        for (Table table : tables) {
            if (table.isAvailable()) {
                table.setAvailable(false);
                table.setName(name);
                System.out.println(name + " has been checked in.");
                break;
            }
        }
    }

    public void checkOut(String name) {
        for (Table table : tables) {
            if (table.getName().equals(name)) {
                table.clearTable();
                System.out.println(name + " has been checked out.");
                if (!waitList.isEmpty()) {
                    table.setName(waitList.removeFirst());
                    table.setAvailable(false);
                    System.out.println(table.getName() + " has been added to waitlist.");
                }
                break;
            } else {
                return;
            }
        }
    }

    public boolean tableIsAvailable() {
        for (Table table : tables) {
            if (table.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tables: " + Arrays.toString(tables.toArray()) + "\nWaitlist: " + Arrays.toString(waitList.toArray()) ;
    }
}
