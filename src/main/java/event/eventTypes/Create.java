package event.eventTypes;

import event.Event;
import repo.Repo;

public class Create extends Event {

    public Create(int id, Repo repo) {
        super(id, repo);
    }
}
