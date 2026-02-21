package event.eventTypes;

import event.Event;

public class Create extends Event {

    private String refType;

    public Create() {
        super();
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    @Override
    public String toString() {
        return "Created " + getPayload().getRef_type() + " in " + getRepo().getName();
    }
}
