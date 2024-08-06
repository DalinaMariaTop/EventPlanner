package eventplanner;

import java.time.LocalDateTime;

public abstract class Event {

    private final int id;
    private final String name;
    private final LocalDateTime dateAndTime;
    protected String type;

    protected Event(int id, String name, LocalDateTime dateAndTime) {
        this.id = id;
        this.name = name;
        this.dateAndTime = dateAndTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public String getType() {
        return type;
    }
    /**
     * Abstract method for specific details
     */
    public abstract String getDetails();
}
