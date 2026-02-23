import client.GitHubClient;
import event.Event;
import parser.EventParser;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
//        if (args.length == 0) {
//            throw new RuntimeException("Usage: ./github-activity.sh <username>");
//        }

        GitHubClient client = new GitHubClient();
        EventParser parser = new EventParser();
        String json;

        try {
            json = client.fetchUserEvents(args[0]);
        } catch (Exception e) {
            throw new RuntimeException("Error. Check username and try again");
        }

        List<Event> events = parser.parseEvents(json);

        for (Event e : events) {
            System.out.println(e.toString());
        }
    }
}
