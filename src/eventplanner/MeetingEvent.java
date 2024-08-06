package eventplanner;

import java.time.LocalDateTime;

public class MeetingEvent extends Event {

    private final String location;

    public MeetingEvent(int id, String name, LocalDateTime dateAndTime, String location) {
        super(id, name, dateAndTime);
        this.location = location;
        this.type = EventType.MEETING;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getDetails() {
        return "The event " + getId() + " takes place: " + getLocation();
    }
}
