package event;

import repo.Repo;

public class Event {
    private int id;
    private Repo repo;

    public Event(int id, Repo repo) {
        this.id = id;
        this.repo = repo;
    }
}
