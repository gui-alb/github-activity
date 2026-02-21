package event.eventTypes;

import event.Event;
import repo.Repo;

public class Member extends Event {

    public Member() {
        super();
    }
    @Override
    public String toString() {
        return getPayload().getAction() + " a collaborator in " + getRepo().getName();
    }
}
