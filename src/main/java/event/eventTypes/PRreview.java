package event.eventTypes;

import event.Event;
import repo.Repo;

public class PRreview extends Event {

    public PRreview() {
        super();
    }
    @Override
    public String toString() {
        return getPayload().getAction() + " a Pull Request in " + getRepo().getName();
    }
}
