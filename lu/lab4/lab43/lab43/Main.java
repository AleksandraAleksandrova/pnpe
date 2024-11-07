package lab43;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> ev = new ArrayList<String>();

        EventLog el = new EventLog(ev);
        el.printEvents();
        System.out.println();

        try {
            el.addEvent("Parti");
            el.addEvent("Kupon");
            el.addEvent("Koncert");
            el.printEvents();
            System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            el.updateEvent("Parti", "Teatur");
            el.printEvents();
            System.out.println();

            el.updateEvent("Kupon", "");
        } catch (blankOrEmptyEvent e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println();
            el.deleteEvent("Kupon");
            el.printEvents();
            System.out.println();

            el.deleteEvent("ABC");
        }catch(MissingEvent e){
            System.out.println(e.getMessage());
        }
    }
}
