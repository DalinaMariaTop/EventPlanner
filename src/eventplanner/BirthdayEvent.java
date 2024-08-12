package eventplanner;

import java.time.LocalDateTime;

public class BirthdayEvent extends Event {

    private final String birthdayPerson;

    public BirthdayEvent(int id, String name, LocalDateTime dateAndTime, String birthdayPerson) {
        super(id, name, dateAndTime);
        this.birthdayPerson = birthdayPerson;
        this.type = EventType.BIRTHDAY;
    }

    public String getBirthdayPerson() {
        return birthdayPerson;
    }

    @Override
    public String getDetails() {
        return getBirthdayPerson() + " celebrates his/her birthday on: " + getDateAndTime().getDayOfMonth() + "." +
                getDateAndTime().getMonth();
    }
}
