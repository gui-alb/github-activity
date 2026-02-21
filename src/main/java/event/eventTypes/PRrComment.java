package event.eventTypes;

import event.Event;
import repo.Repo;

public class PRrComment extends Event {

    public PRrComment(int id, Repo repo) {
        super(id, repo);
    }
}
