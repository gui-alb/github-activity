package event.eventTypes;

import event.Event;
import repo.Repo;

public class Public extends Event {

    public Public() {
        super();
    }
    @Override
    public String toString() {
        return "Made the " + getRepo().getName() + " repository public :)";
    }
}
