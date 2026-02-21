package event.eventTypes;

import event.Event;
import repo.Repo;

public class Release extends Event {

    public Release(int id, Repo repo) {
        super(id, repo);
    }
}
