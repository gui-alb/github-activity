package event.eventTypes;

import event.Event;
import repo.Repo;

public class PR extends Event {

    public PR() {
        super();
    }
    @Override
    public String toString() {
        return getPayload().getAction() + " a Pull Request in " + getRepo().getName();
    }
}
