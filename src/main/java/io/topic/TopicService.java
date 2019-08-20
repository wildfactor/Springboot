package io.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Soham", "HSBC"),
                new Topic("2", "Gourav", "Infosys"),
                new Topic("3", "Soumya", "Marlabs"),
                new Topic("4", "Anand", "Accenture")
                );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
