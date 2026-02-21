package event.eventTypes;

import event.Event;
import repo.Repo;

public class Delete extends Event {

    public Delete() {
        super();
    }

    @Override
    public String toString() {
        return "Deleted " + getPayload().getRef_type() + " in " + getRepo().getName();
    }
}
