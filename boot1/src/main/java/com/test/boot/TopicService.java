package com.test.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Java", "Java Course"),
			new Topic("2", "EJB", "EJB Course"), 
			new Topic("3", "JSF", "JSF Course")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public List<Topic> addTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}

	public List<Topic> updateTopic(Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(topic.getId())) {
				topics.set(i, topic);
				break;
			}
		}
		return topics;
	}

	public List<Topic> deleteTopic(String id) {

		topics.removeIf(t -> t.getId().equals(id));
		return topics;
	}
}
