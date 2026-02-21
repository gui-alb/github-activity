package event.eventTypes;

import event.Event;
import repo.Repo;

public class IssueComment extends Event {

    public IssueComment(int id, Repo repo) {
        super(id, repo);
    }
}
