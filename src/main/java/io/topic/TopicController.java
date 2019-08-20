package io.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "Soham", "HSBC"),
                new Topic("2", "Gourav", "Infosys"),
                new Topic("3", "Soumya", "Marlabs"),
                new Topic("4", "Anand", "Accenture")
        );
    }
}
