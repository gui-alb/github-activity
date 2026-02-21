package event.eventTypes;

import event.Event;
import repo.Repo;

import java.util.Locale;

public class Fork extends Event {

    public Fork() {
        super();
    }
    @Override
    public String toString() {
        return getPayload().getAction() + " " +  getRepo().getName() + " repository";
    }
}
