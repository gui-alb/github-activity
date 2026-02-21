package repo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repo {
    private int id;
    private String name;

    public Repo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
