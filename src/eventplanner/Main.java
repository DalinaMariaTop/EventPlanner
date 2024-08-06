package eventplanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EventPlanner planner = new EventPlanner();

        planner.createBirthdayEvent(232, "John's birthday", LocalDateTime.parse("2024-08-01T14:03:00"), "John Thompson");
        planner.printEventDetails("John's birthday");

        planner.createPrivateEvent(233, "School: parent- teacher hour", LocalDateTime.parse("2024-08-02T14:03:00"), "Prepare for a child-evolution review.");
        planner.printEventDetails("School: parent- teacher hour");

        planner.createMeetingEvent(234, "Office meeting", LocalDateTime.parse("2024-08-03T14:03:00"), "Timisoara Office");
        planner.printEventDetails("Office meeting");


        planner.createBirthdayEvent(232, "Anna's birthday", LocalDateTime.parse("2024-08-08T14:03:00"), "Anna Thompson");
        planner.printEventDetails("Anna's birthday");

        planner.createPrivateEvent(233, "University", LocalDateTime.parse("2024-08-09T14:03:00"), "Prepare for exam.");
        planner.printEventDetails("University");

        planner.createMeetingEvent(234, "Online meeting", LocalDateTime.parse("2024-08-10T14:03:00"), "Online");
        planner.printEventDetails("Online meeting");

        System.out.println("Printing all meeting events: ");

        List<Event> meetingEvent = planner.findEventsByType("MeetingEvent");
        for (Event e : meetingEvent) {
            planner.printEventDetails(e.getName());
        }

        System.out.println("Printing all private events: ");

        List<Event> privateEvent = planner.findEventsByType("PrivateEvent");
        for (Event p : privateEvent) {
            planner.printEventDetails(p.getName());
        }

        System.out.println("Printing all birthday events: ");

        List<Event> birthdayEvent = planner.findEventsByType("BirthdayEvent");
        for (Event b : birthdayEvent) {
            planner.printEventDetails(b.getName());
        }

        System.out.println("Printing all events on the 1st of August");

        List<Event> eventsInAugust = planner.findEventByDate(LocalDate.parse("2024-08-01"));
        for (Event a : eventsInAugust) {
            planner.printEventDetails(a.getName());
        }
    }
}
