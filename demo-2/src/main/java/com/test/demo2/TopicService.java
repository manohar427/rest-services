package com.test.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public List<Topic> addTopic(Topic topic) {
		topicRepository.save(topic);
		return getAllTopics();
	}

	public List<Topic> updateTopic(Topic topic) {
		topicRepository.save(topic);
		return getAllTopics();
	}

	public List<Topic> deleteTopic(String id) {
		topicRepository.deleteById(id);
		return getAllTopics();
	}
}
