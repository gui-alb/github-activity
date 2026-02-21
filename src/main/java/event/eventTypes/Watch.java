package event.eventTypes;

import event.Event;
import repo.Repo;

public class Watch extends Event {

    public Watch(int id, Repo repo) {
        super(id, repo);
    }
}
