import client.GitHubClient;
import event.Event;
import parser.EventParser;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        GitHubClient client = new GitHubClient();
        EventParser parser = new EventParser();

        String json = client.fetchUserEvents("gui-alb");

        List<Event> events = parser.parseEvents(json);

        for (Event e : events) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
