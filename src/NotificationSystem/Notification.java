package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Notification {
    private static final List<String> history = new ArrayList<>();

    public void notify(String message) {
        addToHistory(message);
    }

    public List<String> getHistory() {
        return history;
    }

    void addToHistory(String message) {
        history.add(message);
    }
}
