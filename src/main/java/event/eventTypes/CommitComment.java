package event.eventTypes;

import event.Event;
import repo.Repo;

public class CommitComment extends Event {

    public CommitComment(int id, Repo repo) {
        super(id, repo);
    }
}
