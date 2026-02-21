package event.eventTypes;

import event.Event;
import repo.Repo;

public class Gollum extends Event {

    public Gollum() {
        super();
    }
    @Override
    public String toString() {
        return "Created/updated " + getPayload().getPages().length + " pages in " + getRepo().getName() + " Wiki.";
    }
}
