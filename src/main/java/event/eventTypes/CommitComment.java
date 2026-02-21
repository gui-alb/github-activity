package event.eventTypes;

import event.Event;
import repo.Repo;

public class CommitComment extends Event {

    public CommitComment() {
        super();
    }

    @Override
    public String toString() {
        return "Commented a commit in: " + getRepo().getName();
    }
}
