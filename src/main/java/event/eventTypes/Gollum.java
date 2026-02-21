package event.eventTypes;

import event.Event;
import repo.Repo;

public class Gollum extends Event {

    public Gollum(int id, Repo repo) {
        super(id, repo);
    }
}
