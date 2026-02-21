package event.eventTypes;

import event.Event;
import repo.Repo;

public class PRrComment extends Event {

    public PRrComment() {
        super();
    }
    @Override
    public String toString() {
        return getPayload().getAction() + " a Pull Request comment in " + getRepo().getName();
    }
}
