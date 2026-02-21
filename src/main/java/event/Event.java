package event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import event.eventTypes.*;
import repo.Repo;


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CommitComment.class, name = "CommitCommentEvent"),
        @JsonSubTypes.Type(value = Create.class, name = "CreateEvent"),
        @JsonSubTypes.Type(value = Delete.class, name = "DeleteEvent"),
        @JsonSubTypes.Type(value = Discussion.class, name = "DiscussionEvent"),
        @JsonSubTypes.Type(value = Fork.class, name = "ForkEvent"),
        @JsonSubTypes.Type(value = Gollum.class, name = "GollumEvent"),
        @JsonSubTypes.Type(value = IssueComment.class, name = "IssueCommentEvent"),
        @JsonSubTypes.Type(value = Issues.class, name = "IssuesEvent"),
        @JsonSubTypes.Type(value = Member.class, name = "MemberEvent"),
        @JsonSubTypes.Type(value = PR.class, name = "PullRequestEvent"),
        @JsonSubTypes.Type(value = PRrComment.class, name = "PullRequestReviewCommentEvent"),
        @JsonSubTypes.Type(value = PRreview.class, name = "PullRequestReviewEvent"),
        @JsonSubTypes.Type(value = Public.class, name = "PublicEvent"),
        @JsonSubTypes.Type(value = Push.class, name = "PushEvent"),
        @JsonSubTypes.Type(value = Release.class, name = "ReleaseEvent"),
        @JsonSubTypes.Type(value = Watch.class, name = "WatchEvent"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Event {
    private String id;
    private Repo repo;

    public Event() {}

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Repo getRepo() {
        return repo;
    }
    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public abstract String toString();
}
