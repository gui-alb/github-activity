package event.eventTypes;

import event.Event;
import repo.Repo;

public class PR extends Event {

    public PR(int id, Repo repo) {
        super(id, repo);
    }
}
