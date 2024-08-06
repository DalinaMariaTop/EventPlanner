package eventplanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class EventPlanner {

    private final List<Event> events;

    public EventPlanner() {
        events = new ArrayList<>();
    }

    public void createBirthdayEvent(int id, String name, LocalDateTime dateAndTime, String birthdayPerson) {
        events.add(new BirthdayEvent(id, name, dateAndTime, birthdayPerson));
    }

    public void createMeetingEvent(int id, String name, LocalDateTime dateAndTime, String location) {
        events.add(new MeetingEvent(id, name, dateAndTime, location));
    }

    public void createPrivateEvent(int id, String name, LocalDateTime dateAndTime, String specialDescription) {
        events.add(new PrivateEvent(id, name, dateAndTime, specialDescription));
    }

    public Event findEventByName(String name) {
        for (Event event : events) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public List<Event> findEventByDate(LocalDate date) {
        List<Event> filteredEvents = new ArrayList<>();
        for (Event event : events) {
            if (datesMatch(date, event.getDateAndTime())) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
    }

    private boolean datesMatch(LocalDate date, LocalDateTime dateAndTime) {
        return date.getYear() == dateAndTime.getYear() &&
                date.getMonth() == dateAndTime.getMonth() &&
                date.getDayOfMonth() == dateAndTime.getDayOfMonth();
    }

    public List<Event> findEventsByType(String type) {
        List<Event> filteredEvents = new ArrayList<>();
        for (Event event : events) {
            if (event.getType().equals(type)) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
        //in loc de String type vine enum-ul
    }

    public void printEventDetails(String eventName) {
        Event event = findEventByName(eventName);
        if (event != null) {
            System.out.println("Event ID: " + event.getId());
            System.out.println("Event name: " + event.getName());
            System.out.println("Date and time: " + event.getDateAndTime());
            System.out.println("Details: " + event.getDetails());
        } else {
            System.out.println("Event '" + event.getName() + "with ID" + event.getId() + "' not found.");
        }
    }
    //inversate - sa evit negatia; daca event e null, rezultatul de la else
    //exceptie eventPlannerException cu mesaj - not found something..
}

