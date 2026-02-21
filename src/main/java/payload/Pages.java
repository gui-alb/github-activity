package payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Aux class to gollum activity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pages {
    private String page_name;

    public Pages() {
    }

    public String getPage_name() {
        return page_name;
    }
    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }
}
