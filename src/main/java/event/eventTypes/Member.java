package event.eventTypes;

import event.Event;
import repo.Repo;

public class Member extends Event {

    public Member(int id, Repo repo) {
        super(id, repo);
    }
}
