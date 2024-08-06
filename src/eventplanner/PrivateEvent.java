package eventplanner;

import java.time.LocalDateTime;

public class PrivateEvent extends Event {

    private final String specialDescription;

    public PrivateEvent(int id, String name, LocalDateTime dateAndTime, String specialDescription) {
        super(id, name, dateAndTime);
        this.specialDescription = specialDescription;
        this.type = "PrivateEvent";
    }

    public String getSpecialDescription() {
        return specialDescription;
    }

    @Override
    public String getDetails() {
        return "Private event: " + getId() + " with name: " + getName() + "at: " + getDateAndTime().toString() +
                " with special description" + getSpecialDescription();
    }
}
