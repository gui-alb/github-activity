package event.eventTypes;

import event.Event;
import repo.Repo;

public class Watch extends Event {

    public Watch() {
        super();
    }
    @Override
    public String toString() {
        return "Starred " + getRepo().getName();
    }
}
