package event.eventTypes;

import event.Event;
import repo.Repo;

public class Delete extends Event {

    public Delete(int id, Repo repo) {
        super(id, repo);
    }
}
