package event.eventTypes;

import event.Event;
import repo.Repo;

public class Discussion extends Event {

    public Discussion() {
        super();
    }

    @Override
    public String toString() {
        return getPayload().getAction() + " a discussion in " + getRepo().getName();
    }
}
