package lab43;

import java.util.ArrayList;

public class EventLog {
    private ArrayList<String> events;

    public EventLog(ArrayList<String> events){
        setEvents(events);
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public void addEvent(String newEvent) throws IndexOutOfBoundsException{
        if(events.size() == 100){
            throw new IndexOutOfBoundsException();
        }
        events.add(newEvent);
    }

    public void printEvents(){
        for(String s : events){
            System.out.println(s);
        }
    }

    public void updateEvent(String eventToUpdate, String newEvent) throws blankOrEmptyEvent{
        if(newEvent.isBlank() || newEvent.isEmpty()){
            throw new blankOrEmptyEvent();
        }
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).equals(eventToUpdate)) {
                events.set(i, newEvent);
            }
        }
    }

    public void deleteEvent(String eventToDelete) throws MissingEvent{
        if(!events.contains(eventToDelete)){
            throw new MissingEvent();
        }else {
            events.remove(eventToDelete);
        }
    }
}
