package eventplanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EventPlanner planner = new EventPlanner();

        planner.createBirthdayEvent(232, "John's birthday", LocalDateTime.parse("2024-08-01T14:03:00"), "John Thompson");
        try {
            planner.printEventDetails("John's birthday");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        planner.createPrivateEvent(233, "School: parent- teacher hour", LocalDateTime.parse("2024-08-02T14:03:00"), "Prepare for a child-evolution review.");
        try {
            planner.printEventDetails("School: parent- teacher hour");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        planner.createMeetingEvent(234, "Office meeting", LocalDateTime.parse("2024-08-03T14:03:00"), "Timisoara Office");
        try {
            planner.printEventDetails("Office meeting");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        planner.createBirthdayEvent(235, "Anna's birthday", LocalDateTime.parse("2024-08-08T14:03:00"), "Anna Thompson");
        try {
            planner.printEventDetails("Anna's birthday");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        planner.createPrivateEvent(236, "University", LocalDateTime.parse("2024-08-09T14:03:00"), "Prepare for exam.");
        try {
            planner.printEventDetails("University");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        planner.createMeetingEvent(237, "Online meeting", LocalDateTime.parse("2024-08-10T14:03:00"), "Online");
        try {
            planner.printEventDetails("Online meeting");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Printing all meeting events: ");

        List<Event> meetingEvent = planner.findEventsByType(EventType.MEETING);
        for (Event event : meetingEvent) {
            try {
                planner.printEventDetails(event.getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Printing all private events: ");

        List<Event> privateEvent = planner.findEventsByType(EventType.PRIVATE);
        for (Event p : privateEvent) {
            try {
                planner.printEventDetails(p.getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Printing all birthday events: ");

        List<Event> birthdayEvent = planner.findEventsByType(EventType.BIRTHDAY);
        for (Event b : birthdayEvent) {
            try {
                planner.printEventDetails(b.getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Printing all events on the 1st of August");

        List<Event> eventsInAugust = planner.findEventByDate(LocalDate.parse("2024-08-01"));
        for (Event a : eventsInAugust) {
            try {
                planner.printEventDetails(a.getName());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
