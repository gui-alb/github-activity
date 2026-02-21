package event.eventTypes;

import event.Event;
import repo.Repo;

public class Push extends Event {

    public Push() {
        super();
    }
    @Override
    public String toString() {
        //return "Pushed " + getPayload().getCommits().length + " commits in " + getRepo().getName(); there's no commits field no more T-T
        return "Pushed in " + getRepo().getName();
    }
}
