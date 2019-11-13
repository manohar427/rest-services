package com.test.demo2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicController;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicController.getAllTopics();
	}

	@RequestMapping("/topics/{xxx}")
	public Optional<Topic> getTopic(@PathVariable("xxx") String id) {
		return topicController.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public List<Topic> addTopic(@RequestBody Topic topic) {
		topicController.addTopic(topic);
		return topicController.getAllTopics();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics")
	public List<Topic> updateTopic(@RequestBody Topic topic) {
		topicController.updateTopic(topic);
		return topicController.getAllTopics();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{xxx}")
	public List<Topic> deleteTopic(@PathVariable("xxx") String id) {
		return topicController.deleteTopic(id);
	}
}