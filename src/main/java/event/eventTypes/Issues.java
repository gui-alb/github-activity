package event.eventTypes;

import event.Event;
import repo.Repo;

public class Issues extends Event {

    public Issues() {
        super();
    }

    @Override
    public String toString() {
        return getPayload().getAction() + " a issue in " + getRepo().getName();
    }
}
