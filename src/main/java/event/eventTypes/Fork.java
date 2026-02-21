package event.eventTypes;

import event.Event;
import repo.Repo;

public class Fork extends Event {

    public Fork(int id, Repo repo) {
        super(id, repo);
    }
}
