package client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class GitHubClient {
    private static final String urlBase = "https://api.github.com";

    private final HttpClient client = HttpClient.newHttpClient();

    public String fetchUserEvents(String username) {
        return "";
    }
}
