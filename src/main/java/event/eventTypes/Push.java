package event.eventTypes;

import event.Event;
import repo.Repo;

public class Push extends Event {

    public Push(int id, Repo repo) {
        super(id, repo);
    }
}
