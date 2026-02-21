package parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import event.Event;

import java.util.List;

public class EventParser {
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Event> parseEvents(String json) throws Exception {
        return mapper.readValue(json, new TypeReference<List<Event>>() {});
    }

}
