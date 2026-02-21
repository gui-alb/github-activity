package payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private String ref_type;
    private String action;
    private String[] pages;
    private String[] commits;

    public Payload() {
    }

    public String getRef_type() {
        return ref_type;
    }
    public void setRef_type(String ref_type) {
        this.ref_type = ref_type;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String[] getPages() {
        return pages;
    }
    public void setPages(String[] pages) {
        this.pages = pages;
    }

    public String[] getCommits() {
        return commits;
    }
    public void setCommits(String[] commits) {
        this.commits = commits;
    }
}
