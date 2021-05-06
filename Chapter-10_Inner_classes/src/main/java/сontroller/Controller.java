package сontroller;

import java.util.*;

public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0)
            // создать копию, чтобы избежать модификации списка
            // во время выборки элементов
            for (Event e : new ArrayList<Event>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}
