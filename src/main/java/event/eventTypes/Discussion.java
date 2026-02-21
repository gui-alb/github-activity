package event.eventTypes;

import event.Event;
import repo.Repo;

public class Discussion extends Event {

    public Discussion(int id, Repo repo) {
        super(id, repo);
    }
}
