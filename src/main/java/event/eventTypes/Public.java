package event.eventTypes;

import event.Event;
import repo.Repo;

public class Public extends Event {

    public Public(int id, Repo repo) {
        super(id, repo);
    }
}
